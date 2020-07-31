package kr.smartscore.gplace.domain.common.repository;

import kr.smartscore.gplace.domain.common.entity.CommonAttaches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonAttachesRepository extends JpaRepository<CommonAttaches, Long> {

}
