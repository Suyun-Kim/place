package kr.smartscore.gplace.domain.ticket.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 연습장별 이용권 상품 등록
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ticket_product")
public class TicketProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "ticket_idx", nullable = false)
    private Long ticketIdx;

    @Column(name = "ticket_name", nullable = false)
    private String ticketName;

    @Column(name = "ticket_value", nullable = false)
    private Integer ticketValue;

    @Column(name = "price_ori", nullable = false)
    private Integer priceOri;

    @Column(name = "price_sales", nullable = false)
    private Integer priceSales;

    @Column(name = "price_rate", insertable = false, updatable = false)
    private Integer priceRate;

    @Column(name = "price_supply")
    private Integer priceSupply;

    @Column
    private String options;

    @Column(name = "total_count", nullable = false)
    private Integer totalCount;

    @Column(name = "sales_count", nullable = false)
    private Integer salesCount;

    @Column(name = "avail_count", nullable = false)
    private Integer availCount;

    @Column(name = "max_count", nullable = false)
    private Integer maxCount;

    @Column(name = "use_status", nullable = false)
    private Integer useStatus;

    @Column(name = "status_date", nullable = false)
    private Timestamp statusDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column(name = "show_status", nullable = false)
    private Integer showStatus;

    @Column(insertable = false)
    private Timestamp moddate;

    @Column(insertable = false, updatable = false)
    private Timestamp regDate;

}
