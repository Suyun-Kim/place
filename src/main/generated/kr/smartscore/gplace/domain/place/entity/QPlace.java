package kr.smartscore.gplace.domain.place.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlace is a Querydsl query type for Place
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlace extends EntityPathBase<Place> {

    private static final long serialVersionUID = 654270333L;

    public static final QPlace place = new QPlace("place");

    public final StringPath addr1 = createString("addr1");

    public final StringPath addr2 = createString("addr2");

    public final NumberPath<java.math.BigDecimal> avgScore = createNumber("avgScore", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigInteger> bizFileIdx = createNumber("bizFileIdx", java.math.BigInteger.class);

    public final StringPath bizNo = createString("bizNo");

    public final StringPath dong = createString("dong");

    public final StringPath email = createString("email");

    public final StringPath gugun = createString("gugun");

    public final NumberPath<java.math.BigInteger> idFileIdx = createNumber("idFileIdx", java.math.BigInteger.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Double> lat = createNumber("lat", Double.class);

    public final NumberPath<Double> lng = createNumber("lng", Double.class);

    public final StringPath locPoint = createString("locPoint");

    public final NumberPath<java.math.BigInteger> masterImageIdx = createNumber("masterImageIdx", java.math.BigInteger.class);

    public final DateTimePath<java.sql.Timestamp> moddate = createDateTime("moddate", java.sql.Timestamp.class);

    public final StringPath phone1 = createString("phone1");

    public final StringPath phone2 = createString("phone2");

    public final NumberPath<Integer> place_items = createNumber("place_items", Integer.class);

    public final NumberPath<Integer> placeGrade = createNumber("placeGrade", Integer.class);

    public final StringPath placeName = createString("placeName");

    public final NumberPath<Integer> placeStatus = createNumber("placeStatus", Integer.class);

    public final NumberPath<Integer> placeType = createNumber("placeType", Integer.class);

    public final StringPath postcode = createString("postcode");

    public final StringPath prezName = createString("prezName");

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> sales_rate = createNumber("sales_rate", Integer.class);

    public final NumberPath<Integer> showStatus = createNumber("showStatus", Integer.class);

    public final StringPath sido = createString("sido");

    public final NumberPath<Integer> userCount = createNumber("userCount", Integer.class);

    public final NumberPath<Integer> viewCount = createNumber("viewCount", Integer.class);

    public final StringPath writerId = createString("writerId");

    public final NumberPath<Integer> zzimCount = createNumber("zzimCount", Integer.class);

    public QPlace(String variable) {
        super(Place.class, forVariable(variable));
    }

    public QPlace(Path<? extends Place> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlace(PathMetadata metadata) {
        super(Place.class, metadata);
    }

}

