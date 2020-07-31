package kr.smartscore.gplace.domain.place.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 연습장 정산, 시설 및 기타 정보
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "place_etc")
public class PlaceEtc {

    @Id
    @Column(name = "place_idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placeIdx;

    @Column(name = "promotion_str", nullable = false)
    private String promotionStr;

    @Column
    private Integer boxes;

    @Column
    private Integer distance;

    @Column(name = "distance_unit")
    private String distanceUnit;

    @Column(name = "boxes_scr")
    private Integer boxesScr;

    @Column(name = "distance_scr")
    private Integer distanceScr;

    @Column
    private String facilities;

    @Column(name = "fac_option")
    private String facOption;

    @Column(name = "fac_guide")
    private String facGuide;

    @Column(name = "fac_times")
    private String facTimes;

    @Column
    private String promotion;

    @Column
    private String notice;

    @Column(name = "bill_bank")
    private String billBank;

    @Column(name = "bill_account")
    private String billAccount;

    @Column(name = "bill_name")
    private String billName;

    @Column(name = "bill_type")
    private Integer billType;

    @Column(name = "bill_pay_type")
    private Integer billPayType;

    @Column(name = "bill_pay_day")
    private Integer billPayDay;

    @Column(name = "bill_memo")
    private String billMemo;

    @Column(name = "certificate_file_idx")
    private BigInteger certificateFileIdx;

    @Column(name = "account_file_idx")
    private BigInteger accountFileIdx;

    @Column(name = "moddate_etc", insertable = false)
    private Timestamp moddateEtc;

}
