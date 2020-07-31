package kr.smartscore.gplace.domain.common.repository;

import kr.smartscore.gplace.domain.common.entity.CommonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonPropertiesRepository extends JpaRepository<CommonProperties, Long> {
    List<CommonProperties> findByTargetOrderByIdxAsc(String target);
    CommonProperties findByTargetAndPropertiesCode(String target, Integer properties_code);
    // @Query("SELECT p FROM CommonProperties as p WHERE p.target = ?1")
    // List<CommonProperties> findAll(String target);
}
