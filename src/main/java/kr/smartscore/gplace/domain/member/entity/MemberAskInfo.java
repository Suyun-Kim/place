package kr.smartscore.gplace.domain.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 개인별 정보수정요청 사항
 */

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member_askinfo")
public class MemberAskInfo {
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
    private String title;

    @Column(nullable = false)
    private String askinfo;

    @Column(name = "attach_file_idx")
    private BigInteger attachFileIdx;

    @Column(name = "ask_status")
    private Integer askStatus;

    @Column(name ="status_date")
    private Timestamp statusDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "ask_result")
    private Integer askResult;

    @Column
    private String memo;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;
}
