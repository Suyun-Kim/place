package kr.smartscore.gplace.domain.member.repository;

import kr.smartscore.gplace.domain.member.entity.MemberReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberReviewRepository extends JpaRepository<MemberReview, Long> {

}
