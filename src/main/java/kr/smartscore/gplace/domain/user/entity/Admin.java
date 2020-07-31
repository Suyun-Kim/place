package kr.smartscore.gplace.domain.user.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ss_admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String id;

    private String password;

    private Integer level;

    private String pending;

    @Column(name = "reg_date")
    private Timestamp regDate;

    @Column(name = "pass_modify")
    private Timestamp passModify;

    @Column(name = "manage_club", nullable = false)
    private Integer manageClub;

    @Column(name = "manage_shop", nullable = false)
    private Integer manageShop;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_phone", nullable = false)
    private String userPhone;

    @Column(name = "dir_phone")
    private String dirPhone;

    @Column(name = "user_email")
    private String userEmail;

    private String dept;

    @Column(name = "login_date")
    private Timestamp loginDate;

    @Column(name = "login_fail_cnt")
    private Long loginFailCnt;

    @Column(name = "login_fail_date")
    private Timestamp loginFailDate;

    @Column(name = "login_unblock_date")
    private Timestamp loginUnblockDate;

    @Column(name = "klcns_id")
    private String klcnsId;
}
