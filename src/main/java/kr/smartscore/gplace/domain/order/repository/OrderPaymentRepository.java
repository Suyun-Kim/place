package kr.smartscore.gplace.domain.order.repository;

import kr.smartscore.gplace.domain.order.entity.OrderPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPaymentRepository extends JpaRepository<OrderPayment, Long> {
}
