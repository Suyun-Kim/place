package kr.smartscore.gplace.domain.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/*
 * 개인별 페이지 방문기록
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member_view")
public class MemberView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "member_idx", nullable = false)
    private Integer memberIdx;

    @Column(name = "view_count", nullable = false)
    private Integer viewCount;

    @Column(nullable = false)
    private Date lastday;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;
}
