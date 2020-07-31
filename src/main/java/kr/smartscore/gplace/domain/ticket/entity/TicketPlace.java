package kr.smartscore.gplace.domain.ticket.entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/*
 * 연습장별 판매 이용권 등록
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ticket_place")
public class TicketPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "place_idx", nullable = false)
    private Long placeIdx;

    @Column(name = "ticket_regis", nullable = false)
    private Integer ticketRegis;

    @Column(name = "ticket_type", nullable = false)
    private Integer ticketType;

    @Column(name = "sales_status", nullable = false)
    private Integer salesStatus;

    @Column(name = "sales_rate", nullable = false)
    private Integer salesRate;

    @Column(nullable = false)
    private Integer type;

    @Column(nullable = false)
    private Date sdate;

    @Column(nullable = false)
    private Date edate;

    @Column(name = "avail_month")
    private Integer availMonth;

    @Column
    private String comments;

    @Column(name = "is_weekend", nullable = false)
    private Integer isWeekend;

    @Column(name = "is_mulligan", nullable = false)
    private Integer isMulligan;

    @Column(name = "is_clover", nullable = false)
    private Integer isClover;

    @Column(name = "clover_rate", nullable = false)
    private Integer cloverRate;

    @Column(name = "confirm_status", nullable = false)
    private Integer confirmStatus;

    @Column(name = "regis_status", nullable = false)
    private Integer regisStatus;

    @Column(name = "status_date", nullable = false)
    private Timestamp statusDate;

    @Column(name = "status_reason")
    private String statusReason;

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
