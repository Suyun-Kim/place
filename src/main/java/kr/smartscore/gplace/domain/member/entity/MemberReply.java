package kr.smartscore.gplace.domain.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 회원작성 댓글 - 온라인 동영상
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member_reply")
public class MemberReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "member_idx", nullable = false)
    private Integer memberIdx;

    @Column(nullable = false)
    private String comment;

    @Column(name = "show_status", nullable = false)
    private Integer showStatus;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;
}
