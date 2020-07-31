package kr.smartscore.gplace.config.security;

import kr.smartscore.gplace.domain.member.repository.MemberRepository;
import kr.smartscore.gplace.domain.member.repository.MemberRepositoryCustom;
import kr.smartscore.gplace.infrastructure.dao.auth.vo.AuthVO;
import lombok.extern.log4j.Log4j2;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

@Log4j2
public class AuthorizationFilter extends BasicAuthenticationFilter {


    private MemberRepository memberRepository;

    public AuthorizationFilter(AuthenticationManager authenticationManager,  MemberRepository memberRepository) {
        super(authenticationManager);
        this.memberRepository = memberRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        Authentication authentication = getUsernamePasswordAuthentication(request);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        chain.doFilter(request, response);

    }


    private Authentication getUsernamePasswordAuthentication(HttpServletRequest request) throws UnsupportedEncodingException {
        String sessionEncKey = request.getHeader("Authorization4SS");
        if (sessionEncKey != null) {
            AuthVO user = getAuthenticationToken(sessionEncKey);
            try {
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(user.getIdx(), user.getSessionEncKey(), null);
                return auth;
            } catch (NullPointerException nullPointerException) {
                return null;
            }
        }
        return null;
    }

    private AuthVO getAuthenticationToken(String sessionEncKey) throws UnsupportedEncodingException, NullPointerException {

        if (sessionEncKey.isEmpty()) return null;

        CryptoUtil cryptoUtil = new CryptoUtil();
        String mno = "";
        String enc = "";
        String dec = "";
        AuthVO user = null;

        String[] arr_auth_key = sessionEncKey.split("\\|");

        if (arr_auth_key.length == 2 && !arr_auth_key[0].isEmpty()) {
            mno = cryptoUtil.decKey(arr_auth_key[0], null);
            Long idx = Long.parseLong(mno);
            enc = arr_auth_key[1];
            user = memberRepository.findByIdx(idx);
        }

        if (user == null) return null;

        dec = cryptoUtil.decKey(enc, user.getSessionEncKey());

        String[] arr_dec = dec.split("\\|");
        String idx = String.valueOf(Integer.parseInt(arr_dec[0]));
        String time = arr_dec[1];

        Date date = new Date();

        long d1 = (date.getTime() / 1000);
        long d2 = Long.parseLong(time);
        long diff = Math.abs((d1 - d2));

        if (mno.equals(idx) && diff < 60) return null;

        return user;
    }
}