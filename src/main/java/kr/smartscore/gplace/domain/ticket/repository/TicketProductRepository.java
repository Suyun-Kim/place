package kr.smartscore.gplace.domain.ticket.repository;

import kr.smartscore.gplace.domain.ticket.entity.TicketProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketProductRepository extends JpaRepository<TicketProduct, Long> {
}
