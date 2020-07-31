package kr.smartscore.gplace.domain.place.repository;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Projections;
import kr.smartscore.gplace.domain.common.entity.QCommonProperties;
import kr.smartscore.gplace.domain.place.dto.PlaceInfoDto;
import kr.smartscore.gplace.domain.place.entity.QPlace;

import kr.smartscore.gplace.domain.place.repository.PlaceRepositoryCustom;

import org.springframework.util.StringUtils;
import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.smartscore.gplace.domain.place.entity.Place;
import lombok.RequiredArgsConstructor;
import com.querydsl.core.types.dsl.BooleanExpression;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class PlaceRepositoryImpl implements PlaceRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<Place> findByDynamic(String placeType, String regisType) {
        return queryFactory.selectFrom(QPlace.place)
                .where(eqPlaceType(regisType))
                .fetch();
    }

    @Override
    // public QueryResults<PlaceInfoDto> findByJoinAll(String placeType, String regisType) {
    public List<PlaceInfoDto> findByJoinAll(String placeType, String regisType) {
        // https://www.programcreek.com/java-api-examples/?api=com.querydsl.core.types.OrderSpecifier
        List<OrderSpecifier<?>> specifiers = new ArrayList<>();
        //specifiers.add(QPlace.place.phone1.desc());
        specifiers.add(QCommonProperties.commonProperties.propertiesName.asc());
        specifiers.add(QCommonProperties.commonProperties.orderSeq.asc());

        return queryFactory.select(Projections.fields(PlaceInfoDto.class ,
                QPlace.place.placeName.as("placeName"),
                QCommonProperties.commonProperties.propertiesName.as("placeTypeName")))
                .from(QPlace.place)
                .leftJoin(QCommonProperties.commonProperties)
                    .on(QPlace.place.placeType.eq(QCommonProperties.commonProperties.propertiesCode)
                        .and(QCommonProperties.commonProperties.target.eq("PLACE_TYPE")))
                .limit(20)
                .offset(0)
                .orderBy(specifiers.toArray(new OrderSpecifier[specifiers.size()]))
                // .fetchResults(); // total 갯수도 가져오기 위해서
                .fetch();

    }

    @Override
    public List<PlaceInfoDto> findByPlaceAdmin() {
        return null;
    }

    // Place 테이블에서 regisType 삭제
    /*private BooleanExpression eqRegisType (String regisType) {
        if (StringUtils.isEmpty(regisType)) {
            return null;
        }
        return QPlace.place.regisType.eq(Integer.parseInt(regisType));
    }*/
    private BooleanExpression eqPlaceType (String placeType) {
        if (StringUtils.isEmpty(placeType)) {
            return null;
        }
        return QPlace.place.placeType.eq(Integer.parseInt(placeType));
    }
}
