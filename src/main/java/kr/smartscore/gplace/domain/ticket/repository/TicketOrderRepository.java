package kr.smartscore.gplace.domain.ticket.repository;

import kr.smartscore.gplace.domain.ticket.entity.TicketOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketOrderRepository extends JpaRepository<TicketOrder, Long> {

}
