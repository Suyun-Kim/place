package kr.smartscore.gplace.domain.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/*
 * 회원작성 후기 - 연습장, 레슨프로
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member_review")
public class MemberReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "member_idx", nullable = false)
    private Integer memberIdx;

    @Column(name = "score_item1",nullable = false)
    private BigDecimal scoreItem1;

    @Column(name = "score_item2",nullable = false)
    private BigDecimal scoreItem2;

    @Column(name = "score_item3",nullable = false)
    private BigDecimal scoreItem3;

    @Column(name = "score_item4", nullable = false)
    private BigDecimal scoreItem4;

    @Column(name = "score_item5", nullable = false)
    private BigDecimal scoreItem5;

    @Column(name = "score_avg", nullable = false)
    private BigDecimal scoreAvg;

    @Column(nullable = false)
    private String comment;

    @Column
    private Integer likes;

    @Column
    private Integer dislikes;

    @Column
    private String reply;

    @Column(name = "reply_id")
    private String replyId;

    @Column(name = "reply_date")
    private Timestamp replyDate;

    @Column(name = "show_status", nullable = false)
    private Integer showStatus;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;
}
