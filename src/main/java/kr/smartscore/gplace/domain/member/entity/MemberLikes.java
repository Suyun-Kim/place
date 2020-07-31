package kr.smartscore.gplace.domain.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 개인별 좋아요 / 공감 기록
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member_likes")
public class MemberLikes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "member_idx", nullable = false)
    private Long memberIdx;

    @Column(name = "like_status", nullable = false)
    private String likeStatus;

    @Column(insertable = false)
    private Timestamp moddate;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;
}
