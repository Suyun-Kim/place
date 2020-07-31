package kr.smartscore.gplace.domain.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 메뉴별 노출 대상
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "common_menu")
public class CommonMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private Integer menu;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "order_seq", nullable = false)
    private Integer orderSeq;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column(name = "is_show", nullable = false)
    private String isShow;

    @Column(insertable = false, updatable = false)
    private Timestamp regDate;
}
