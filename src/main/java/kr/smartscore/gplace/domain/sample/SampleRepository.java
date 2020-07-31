package kr.smartscore.gplace.domain.sample;

import kr.smartscore.gplace.domain.sample.entity.Sample;
import kr.smartscore.gplace.infrastructure.dao.sample.vo.SampleVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository
public interface SampleRepository extends JpaRepository<Sample, Long>  {
    Sample findByEmail(String email);
}


