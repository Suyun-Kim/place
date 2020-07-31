package kr.smartscore.gplace.domain.member.repository;

import kr.smartscore.gplace.infrastructure.dao.auth.vo.AuthVO;

public interface MemberRepositoryCustom {
    AuthVO findByIdx(Long idx);
}
