package kr.smartscore.gplace.domain.member.repository;

import kr.smartscore.gplace.domain.member.entity.MemberQna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberQnaRepository extends JpaRepository<MemberQna, Long> {

}
