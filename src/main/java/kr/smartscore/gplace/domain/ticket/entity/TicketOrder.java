package kr.smartscore.gplace.domain.ticket.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

/*
 * 이용권 삼품의 구매 및 취소 / 환불
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ticket_order")
public class TicketOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "product_idx", nullable = false)
    private Long productIdx;

    @Column(name = "member_idx", nullable = false)
    private Integer memberIdx;

    @Column
    private Date sdate;

    @Column
    private Date edate;



}
