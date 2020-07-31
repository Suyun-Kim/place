package kr.smartscore.gplace.domain.order.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 공통 결제기록
 */

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "order_payment")
public class OrderPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer target;

    @Column(name = "targe_idx", nullable = false)
    private Long targetIdx;

    @Column(name = "membe_idx", nullable = false)
    private Integer memberIdx;

    @Column(name = "pay_method", nullable = false)
    private Integer payMethod;

    @Column(name = "pay_total", nullable = false)
    private Integer payTotal;

    @Column(name = "pay_point")
    private Integer payPoint;

    @Column(name = "pay_mulligan")
    private Integer payMulligan;

    @Column(name = "pay_mulligan_idx")
    private BigInteger payMulliganIdx;

    @Column(name = "pay_amount", nullable = false)
    private Integer payAmount;

    @Column(name = "pay_date")
    private Timestamp payDate;

    @Column(name = "pay_status", nullable = false)
    private Integer payStatus;

    @Column(name = "pay_error")
    private String payError;

    @Column(name = "pay_tid")
    private String payTid;

    @Column(name = "payer_name")
    private String payerName;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_account")
    private String bankAccount;

    @Column(name = "bank_expired")
    private String bankExpired;

    @Column(insertable = false)
    private Timestamp moddate;

    @Column(insertable = false, updatable = false)
    private Timestamp regDate;

}
