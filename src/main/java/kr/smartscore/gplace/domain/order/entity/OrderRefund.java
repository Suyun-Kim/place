package kr.smartscore.gplace.domain.order.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 공통 취소 / 환불 기록
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "order_refund")
public class OrderRefund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "target_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "member_idx", nullable = false)
    private Integer memberIdx;

    @Column(name = "rfd_method", nullable = false)
    private Integer rfdMethod;

    @Column(name = "rfd_total", nullable = false)
    private Integer rfdTotal;

    @Column(name = "rfd_point", nullable = false)
    private Integer rfdPoint;

    @Column(name = "rfd_mulligan")
    private Integer rfdMulligan;

    @Column(name = "rfd_mulligan_idx")
    private BigInteger rfdMulliganIdx;

    @Column(name = "rfd_amount", nullable = false)
    private Integer rfdAmount;

    @Column(name = "rfd_status", nullable = false)
    private Integer rfdStatus;

    @Column(name = "rfd_error")
    private String rfdError;

    @Column(name = "rfd_tid")
    private String rfdTid;

    @Column(name = "withdraw_point")
    private Integer withdrawPoint;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_owner")
    private String bankOwner;

    @Column(name = "bank_account")
    private String bankAccount;

    @Column(name = "bank_expried")
    private Timestamp bankExpried;

    @Column(insertable = false)
    private Timestamp moddate;

    @Column(insertable = false, updatable = false)
    private Timestamp regDate;

}
