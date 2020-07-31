package kr.smartscore.gplace.infrastructure.dao.sample.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
@ApiModel(value="Sample>관리자정보VO")
@Getter
public class SampleVo {
    @ApiModelProperty(required=true, example="1", notes="관리자Idx")
    private Long id;
    @ApiModelProperty(required=true, example="grukim", notes="관리자명")
    private String name;
    @ApiModelProperty(required=true, example="test@smartscore.com", notes="이메일")
    private String email;
    @ApiModelProperty(example="http://image.smartscore.kr/pc3/ic_logo_white.png", notes="이미지URL")
    private String picture;
    @ApiModelProperty(required=true, example="TEST", notes="권한코드")
    private String role;
}
