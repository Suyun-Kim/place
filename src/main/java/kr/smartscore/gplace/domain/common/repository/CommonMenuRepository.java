package kr.smartscore.gplace.domain.common.repository;

import kr.smartscore.gplace.domain.common.entity.CommonMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonMenuRepository extends JpaRepository<CommonMenu, Long> {

}
