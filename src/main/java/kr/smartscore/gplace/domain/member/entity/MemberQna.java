package kr.smartscore.gplace.domain.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 회원(이용자) QnA - 연습장, 레슨프로
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member_qna")
public class MemberQna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "parent_idx")
    private Long parentIdx;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "member_idx", nullable = false)
    private Integer memberIdx;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String question;

    @Column(name = "attach_file_idx")
    private BigInteger attachFileIdx;

    @Column
    private String answer;

    @Column(name = "answer_id")
    private String answerId;

    @Column(name = "qna_status", insertable = false, updatable = false)
    private Integer qnaStatus;

    @Column(name = "status_date", nullable = false)
    private Timestamp statusDate;

    @Column(name = "is_secret", nullable = false)
    private Integer isSecret;

    @Column(name = "show_status", nullable = false)
    private Integer showStatus;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;
}
