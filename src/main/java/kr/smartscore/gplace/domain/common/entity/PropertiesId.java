package kr.smartscore.gplace.domain.common.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
public class PropertiesId implements Serializable {

    @Column
    private String target;
    @Column
    private String properties_code;

}
