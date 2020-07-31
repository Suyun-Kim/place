package kr.smartscore.gplace.domain.common.repository;

import kr.smartscore.gplace.domain.common.entity.CommonHistories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonHistoriesRepository extends JpaRepository<CommonHistories, Long> {

}
