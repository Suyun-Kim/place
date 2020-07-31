package kr.smartscore.gplace.domain.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 대상별 변경 이력
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "common_histories")
public class CommonHistories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Integer targetIdx;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column(name = "asis_json")
    private String asisJson;

    @Column(name = "tobe_json")
    private String tobeJson;

    @Column(name = "is_1st")
    private String is1st;

    @Column(insertable = false, updatable = false)
    private Timestamp regDate;
}
