package kr.smartscore.gplace.domain.member.repository;

import kr.smartscore.gplace.domain.member.entity.MemberView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberViewRepository extends JpaRepository<MemberView, Long> {

}
