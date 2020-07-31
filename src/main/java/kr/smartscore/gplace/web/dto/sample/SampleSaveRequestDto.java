package kr.smartscore.gplace.web.dto.sample;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kr.smartscore.gplace.domain.common.code.RoleType;
import kr.smartscore.gplace.domain.sample.entity.Sample;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@ApiModel(value="Sample>관리자정보RequstDTO")
@Getter
@Builder
// @NoArgsConstructor
public class SampleSaveRequestDto {
    @ApiModelProperty(required=true, example="grukim", notes="관리자명")
    private String name;
    @ApiModelProperty(required=true, example="test@smartscore.com", notes="이메일")
    private String email;
    @ApiModelProperty(example="http://image.smartscore.kr/pc3/ic_logo_white.png", notes="이미지URL")
    private String picture;
    @ApiModelProperty(required=true, example="TEST", notes="권한코드")
    private RoleType role;
    /*
    public SampleSaveRequestDto(String name, String email, String picture, String role) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }
    */
    public Sample toEntity() {
        return Sample.builder()
                .name(this.name)
                .email(this.email)
                .picture(this.picture)
                .role(this.role.name())
                .build();
    }

}
