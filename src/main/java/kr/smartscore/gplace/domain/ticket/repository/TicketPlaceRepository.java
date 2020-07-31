package kr.smartscore.gplace.domain.ticket.repository;

import kr.smartscore.gplace.domain.ticket.entity.TicketPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketPlaceRepository extends JpaRepository<TicketPlace, Long> {
}
