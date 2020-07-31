package kr.smartscore.gplace.domain.place.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 연습장의 구매 / 등록한 광고 상품의 취소, 변경 or 환불
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "place_advertising_claim")
public class placeAdvertisingClaim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "place_advertising_idx", nullable = false)
    private Long placeAdvertisingIdx;

    @Column(name = "claim_type", nullable = false)
    private Integer claimType;

    @Column(name = "claim_reason", nullable = false)
    private Integer claimReason;

    @Column(name = "clm_status", nullable = false)
    private Integer clmStatus;

    @Column(name = "status_date", nullable = false)
    private Timestamp statusDate;

    @Column(name = "status_reason")
    private String statusReason;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;

    @Column(name = "refund_amount")
    private Integer refundAmount;

    @Column(name = "refund_bank")
    private String refundBank;

    @Column(name = "refund_name")
    private String refundName;

    @Column(name = "refund_account")
    private String refundAccount;


}
