package kr.smartscore.gplace.domain.member.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="ss_member_extra_info")
public class MemberExtraInfo {

    @Id
    @Column(name = "user_idx")
    private Long userIdx;

    @Column(name = "name_auth")
    private Timestamp nameAuth;

    @Column(name = "user_ci")
    private String userCi;

    @Column(name = "user_di")
    private String userDi;

    @Column(name = "user_nation")
    private String userNation;

    @Column(name = "is_open_address")
    private String isOpenAddress;

    @Column(name = "is_open_birthday")
    private String isOpenBirthday;

    @Column(name = "is_open_email")
    private String isOpenEmail;

    private String postcode;

    @Column(name = "extra_address1")
    private String extraAddress1;

    @Column(name = "extra_address2")
    private String extraAddress2;

    @Column(name = "is_caddiebag_open")
    private String isCaddiebagOpen;

    @Column(name = "session_enc_key", nullable = false)
    private String sessionEncKey;

    @Column(name = "session_enc_key_pc")
    private String sessionEncKeyPc;

    @Column(name = "is_terms_agree")
    private String isTermsAgree;

    @Column(name = "is_privacy_agree")
    private String isPrivacyAgree;

    @Column(name = "is_location_agree")
    private String isLocationAgree;

    @Column(name = "is_third_party_agree")
    private String isThirdPartyAgree;

    @Column(name = "is_push_manner")
    private Integer isPushManner;

    @Column(name = "is_ad_sms")
    private Integer isAdSms;

    @Column(name = "login_fail_cnt")
    private Long loginFailCnt;

    @Column(name = "login_fail_date")
    private Timestamp loginFailDate;

    @Column(name = "login_unblock_date")
    private Timestamp loginUnblockDate;

    @Column(name = "is_term_confirm")
    private String isTermConfirm;

    @Column(name = "kcmuser_name")
    private String kcmuserName;

    @Column(name = "team_invite")
    private String teamInvite;

    @Column(name = "team_push")
    private String teamPush;

    @Column(name = "certificate_type")
    private String certificateType;

    @Column(name = "certificate_mod_date")
    private String certificateModDate;

    @Column(name = "is_video_continue_play")
    private String isVideoContinuePlay;

    @Column(name = "is_network_notice")
    private String isNetworkNotice;

    @Column(name = "service_list_push_yn")
    private String serviceListPushYn;

    @Column(name = "last_pushread_time")
    private Timestamp lastPushreadTime;




}
