package kr.smartscore.gplace.domain.advertising.repository;

import kr.smartscore.gplace.domain.advertising.entity.Advertising;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertisingRepository extends JpaRepository<Advertising, Long> {
}
