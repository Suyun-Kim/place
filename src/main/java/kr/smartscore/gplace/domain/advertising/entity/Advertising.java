package kr.smartscore.gplace.domain.advertising.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

/*
* 유형별 광고 상품 정의
*/

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "advertising")
public class Advertising {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "adv_type", nullable = false)
    private String advType;

    @Column(name = "unit_term", nullable = false)
    private Integer unitTerm;

    @Column(name = "unit_fee1", nullable = false)
    private Integer unitFee1;

    @Column(name = "unit_fee2")
    private Integer unitFee2;

    @Column(name = "writerId", nullable = false)
    private String writer_id;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;


}
