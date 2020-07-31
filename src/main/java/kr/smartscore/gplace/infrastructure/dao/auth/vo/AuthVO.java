package kr.smartscore.gplace.infrastructure.dao.auth.vo;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@ToString
@AllArgsConstructor
public class AuthVO {

    private Long idx;
    private String userName;
    private String userPhone;
    private String sessionEncKey;

}
