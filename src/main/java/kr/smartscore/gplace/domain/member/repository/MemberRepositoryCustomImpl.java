package kr.smartscore.gplace.domain.member.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.smartscore.gplace.domain.member.entity.QMember;
import kr.smartscore.gplace.domain.member.entity.QMemberExtraInfo;
import kr.smartscore.gplace.infrastructure.dao.auth.vo.AuthVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberRepositoryCustomImpl implements MemberRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    QMember member = QMember.member;
    QMemberExtraInfo memberExtraInfo = QMemberExtraInfo.memberExtraInfo;

    @Override
    public AuthVO findByIdx(Long idx) {

        return queryFactory.select(
                Projections.constructor
                        (AuthVO.class,
                                member.idx, member.userName, member.userPhone, memberExtraInfo.sessionEncKey))
                .from(member)
                .innerJoin(memberExtraInfo)
                    .on(member.idx.eq(memberExtraInfo.userIdx))
                .where(member.idx.eq(idx))
                .fetchOne();
    }
}
