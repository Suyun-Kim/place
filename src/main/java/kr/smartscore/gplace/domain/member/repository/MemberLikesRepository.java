package kr.smartscore.gplace.domain.member.repository;

import kr.smartscore.gplace.domain.member.entity.MemberLikes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberLikesRepository extends JpaRepository<MemberLikes, Long> {

}
