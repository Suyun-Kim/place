package kr.smartscore.gplace.domain.place.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 연습장별 노출 광고 상품 등록
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "place_advertising")
public class PlaceAdvertising {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "place_idx", nullable = false)
    private Long placeIdx;

    @Column(name = "advertising_idx", nullable = false)
    private Long advertisingIdx;

    @Column(name = "adv_target", nullable = false)
    private Integer advTarget;

    @Column(name = "adv_target_idx", nullable = false)
    private Long advTargetIdx;

    @Column(name = "adv_menu", nullable = false)
    private Integer advMenu;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Timestamp sdate;

    @Column(nullable = false)
    private Timestamp edate;

    @Column(nullable = false)
    private Integer priceOri;

    @Column(name = "price_rate", nullable = false)
    private Integer priceRate;

    @Column(name = "price_sales", nullable = false)
    private Integer priceSales;

    @Column
    private String memo;

    @Column(name = "pay_amount", nullable = false)
    private Integer payAmount;

    @Column(name = "refund_amount", nullable = false)
    private Integer refundAmount;

    @Column(name = "regi_status", nullable = false)
    private Integer regiStatus;

    @Column(name = "status_date", nullable = false)
    @GeneratedValue
    private Timestamp statusDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column(name = "show_status", nullable = false)
    private String showStatus;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;

}
