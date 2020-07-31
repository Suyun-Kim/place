package kr.smartscore.gplace.domain.member.repository;

import kr.smartscore.gplace.domain.member.entity.MemberReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberReplyRepository extends JpaRepository<MemberReply, Long> {

}
