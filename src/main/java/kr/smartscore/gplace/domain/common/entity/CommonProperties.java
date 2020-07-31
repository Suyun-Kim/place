package kr.smartscore.gplace.domain.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 대상별 고유 속성
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "common_properties")
public class CommonProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private String target;

    @Column(name = "properties_code", nullable = false)
    private Integer propertiesCode;

    @Column(name = "properties_value", nullable = true)
    private Integer propertiesValue;

    @Column(name = "properties_name", nullable = false)
    private String propertiesName;

    @Column(name = "order_seq")
    private Integer orderSeq;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column
    private String memo;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;
}
