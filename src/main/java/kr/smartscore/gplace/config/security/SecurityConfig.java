package kr.smartscore.gplace.config.security;

import kr.smartscore.gplace.domain.member.repository.MemberRepository;
import kr.smartscore.gplace.domain.member.repository.MemberRepositoryCustom;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;

@Configuration
@EnableWebSecurity
@Log4j2
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final MemberRepository memberRepository;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .addFilter(new AuthorizationFilter(authenticationManager(), memberRepository))
            .authorizeRequests()
            .antMatchers("/*").permitAll()
            .anyRequest().authenticated();
        http.headers().frameOptions().sameOrigin();
    }

    @Bean
    public HttpFirewall defaultHttpFirewall() {
        DefaultHttpFirewall firewall = new DefaultHttpFirewall();
        firewall.setAllowUrlEncodedSlash(true);
        return firewall;
    }

    @Override
    public void configure (WebSecurity web) {
        web.ignoring().antMatchers("/static/css/**", "/static/js/**", "/static/lib/**",
                "/swagger-resources/**", "/swagger-ui.html", "/webjars/**", "/swagger/**","/v2/**");
        web.ignoring().antMatchers("/aa/header_key/**");
        web.httpFirewall(defaultHttpFirewall());
    }

}
