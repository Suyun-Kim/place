package kr.smartscore.gplace.domain.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 첨부파일이 복수일 경우 대상 별 첨부파일 또는 URL 정보
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "common_attaches")
public class CommonAttaches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "source_type", nullable = false)
    private String sourceType;

    @Column(name = "source_idx")
    private BigInteger sourceIdx;

    @Column
    private String url;

    @Column
    private String title;

    @Column
    private Integer category;

    @Column
    private String contents;

    @Column(insertable = false, updatable = false)
    private Timestamp regDate;
}
