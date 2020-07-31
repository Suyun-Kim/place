package kr.smartscore.gplace.domain.member.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/*
 * 사용자 인증 관련 유저 정보
 */

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="ss_member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "club_idx", nullable = false)
    private Integer clubIdx;

    @Column(name = "club_member_yn", nullable = false)
    private String clubMemberYn;

    @Column(name = "user_phone", nullable = false)
    private String userPhone;

    @Column
    private String password;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "phone_key", nullable = false)
    private String phoneKey;

    @Column(name = "use_age")
    private Integer userAge;

    @Column(name = "user_si")
    private String userSi;

    @Column(name = "user_gu")
    private String user_gu;

    @Column(name = "reg_channel")
    private String regChannel;

    @Column(name = "reg_date")
    private Timestamp regDate;

    @Column(name = "auth_date")
    private Timestamp authDate;

    @Column(name = "phone_auth")
    private String phoneAuth;

    @Column(nullable = false)
    private String gender;

    @Column(name = "push_agreed")
    private String pushAgreed;

    private String pending;

    @Column(name = "user_nick")
    private String userNick;

    private String address;

    private Float legnth;

    private Float weight;

    @Column(name = "become_date")
    private Timestamp becomeDate;

    private String email;

    @Column(name = "black_idx", nullable = false)
    private Long blackIdx;

    private String isPro;

    @Column(nullable = false)
    private String marry;

    @Column(nullable = false)
    private String membership;

    @Column(nullable = false)
    private String thumb;

    @Column(name = "membership_st_dt")
    private Timestamp membershipStDt;

    @Column(name = "membership_ed_dt")
    private Timestamp membershipEdDt;

    @Column(name = "device_type", nullable = false)
    private String deviceType;

    @Column(name = "device_model", nullable = false)
    private String deviceModel;

    @Column(name = "device_os_ver", nullable = false)
    private String deviceOsVer;

    @Column(name = "tablet_reg_date")
    private Timestamp tabletRegDate;

    @Column(name = "out_date")
    private Timestamp outDate;

    @Column(name = "caddle_idx", nullable = false)
    private Integer caddleIdx;

    @Column(name = "point_get", nullable = false)
    private Integer pointGet;

    @Column(name = "point_use", nullable = false)
    private Integer pointUse;

    @Column(name = "clover_symbol", nullable = false)
    private String cloverSymbol;

    @Column(name = "app_ver", nullable = false)
    private String appVer;

    @Column(name = "rounding_cnt", nullable = false)
    private Integer roundingCnt;

    @Column(name = "rnd_tablet_cnt", nullable = false)
    private Integer rndTabletCnt;

    @Column(name = "rnd_type_cnt", nullable = false)
    private Integer rndTypeCnt;

    @Column(name = "rnd_self_cnt", nullable = false)
    private Integer rndSelfCnt;

    private String country;

    private Date birthDay;

    @Column(name = "is_autosync_frd_list", nullable = false)
    private Integer isAutosyncFrdList;

    @Column(name = "last_pb_sync_date")
    private Timestamp lastPbSyncDate;

    @Column(name = "is_open_monthly_rank", nullable = false)
    private Integer isOpenMonthlyRank;

    @Column(name = "is_allow_golf_frd", nullable = false)
    private Integer isAllowGolfFrd;

    @Column(name = "is_open_score", nullable = false)
    private Integer isOpenScore;

    @Column(name = "rounding_open_type", nullable = false)
    private String roundingOpenType;

    @Column(name = "is_allow_email_noti", nullable = false)
    private Integer isAllowEmailNoti;

    @Column(name = "timeline_open_type", nullable = false)
    private String timelineOpenType;

    @Column(name = "acc_status", nullable = false)
    private String accStatus;

    @Column(name = "round_status", nullable = false)
    private String roundStatus;

    @Column(name = "bg_img")
    private String bgImg;

    @Column(name = "profile_img")
    private String profileImg;

    @Column(name = "timeline_photo_open_type", nullable = false)
    private String timelinePhotoOpenType;

    @Column(name = "timeline_friend_open_type", nullable = false)
    private String timelineFriendOpenType;

    @Column(name = "is_block_all_friend")
    private Integer isBlockAllFriend;

    @Column(name = "is_push_date")
    private Timestamp isPushDate;

    @Column(name = "phone_model")
    private String phoneModel;

    @Column(name = "phone_os")
    private String phoneOs;

    @Column(name = "round_exposed")
    private String roundExposed;

    @Column(name = "round_lock")
    private String roundLock;

    @Column(name = "rounding_open_type_date")
    private Timestamp roundingOpenTypeDate;

    private Integer handicap;

    @Column(name = "handicap_edit_date")
    private Timestamp handicapEditDate;

    @Column(name = "handicap_edit_cnt")
    private Integer handicapEditCnt;

    @Column(name = "last_visit_date")
    private Date lastVisitDate;

    @Column(name = "is_push_type")
    private String isPushType;

    @Column(name = "is_push_silent_start")
    private Integer isPushSilentStart;

    @Column(name = "is_push_silent_end")
    private Integer isPushSilentEnd;

    @Column(name = "is_push_item")
    private String isPushItem;

    @Column(name = "email_auth")
    private String emailAuth;

    @Column(name = "ad_push_agreed")
    private Integer adPushAgreed;


}
