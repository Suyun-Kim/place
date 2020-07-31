package kr.smartscore.gplace.web.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import kr.smartscore.gplace.config.security.CryptoUtil;
import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapper;
import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperValue;
import kr.smartscore.gplace.domain.common.entity.CommonProperties;
import kr.smartscore.gplace.domain.member.entity.Member;
import kr.smartscore.gplace.domain.member.repository.MemberRepository;
import kr.smartscore.gplace.infrastructure.dao.auth.vo.AuthVO;
import kr.smartscore.gplace.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Api(tags = "COMMON")
@RequiredArgsConstructor
@RestController
public class CommonRestController {

    @Qualifier("urbanSqlSession")
    private final MemberRepository memberRepository;
    @Autowired
    private EnumMapper enumMapper;
    private final CommonService commonService;



    @ApiOperation(value = "TEST용 HEADER KEY 값 생성", response = String.class,tags = "COMMON")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ID", value = "ID", required = true, dataType = "string", paramType = "path", defaultValue = "2000729")
    })
    @GetMapping(value = "aa/header_key/{ID}")
    public String getHeaderKey(HttpServletRequest req, @PathVariable("ID") Integer userIdx) {

        String encKey = "da0966933d2d22db";

        try {
            AuthVO user = memberRepository.findByIdx(Long.parseLong(userIdx.toString()));

            if (user == null)
                return "회원번호를 확인하세요.";

            Date cur_date = new Date();
            String cur_time = ((Long)(cur_date.getTime() / 1000)).toString();

            CryptoUtil cryptoUtil = new CryptoUtil();
            encKey = cryptoUtil.encrypt(userIdx.toString(), cryptoUtil.getSeed_key()) + "|" +
                    cryptoUtil.encrypt(userIdx.toString() + "|" + cur_time, encKey);

        } catch (Exception e) {

        }

        return encKey;
    }

    @ApiOperation(value="코드 조회(From DB)", response=Long.class, tags = "COMMON")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "target", value = "targetKey", required = true, dataType = "string", paramType = "path", defaultValue = "FACILITIES")
    })
    @GetMapping("api/common-properties/{target}")
    public List<CommonProperties> findById(@PathVariable String target) {
        return commonService.getCommonPropertiesList(target);
    }
    @ApiOperation(value="코드 조회(From ENUM)", response=Long.class, tags = "COMMON")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "enumType", required = true, dataType = "string", paramType = "path", defaultValue = "BillPayType")
    })
    @GetMapping("api/code/{id}")
    public List<EnumMapperValue> getCodeList(@PathVariable String id) {
        return enumMapper.get(id);
    }





}
