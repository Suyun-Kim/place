package kr.smartscore.gplace.domain.order.repository;

import kr.smartscore.gplace.domain.order.entity.OrderRefund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRefundRepository extends JpaRepository<OrderRefund, Long> {
}
