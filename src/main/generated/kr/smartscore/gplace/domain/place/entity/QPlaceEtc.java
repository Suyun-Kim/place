package kr.smartscore.gplace.domain.place.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceEtc is a Querydsl query type for PlaceEtc
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlaceEtc extends EntityPathBase<PlaceEtc> {

    private static final long serialVersionUID = 805971159L;

    public static final QPlaceEtc placeEtc = new QPlaceEtc("placeEtc");

    public final NumberPath<java.math.BigInteger> accountFileIdx = createNumber("accountFileIdx", java.math.BigInteger.class);

    public final StringPath billAccount = createString("billAccount");

    public final StringPath billBank = createString("billBank");

    public final StringPath billMemo = createString("billMemo");

    public final StringPath billName = createString("billName");

    public final NumberPath<Integer> billPayDay = createNumber("billPayDay", Integer.class);

    public final NumberPath<Integer> billPayType = createNumber("billPayType", Integer.class);

    public final NumberPath<Integer> billType = createNumber("billType", Integer.class);

    public final NumberPath<Integer> boxes = createNumber("boxes", Integer.class);

    public final NumberPath<Integer> boxesScr = createNumber("boxesScr", Integer.class);

    public final NumberPath<java.math.BigInteger> certificateFileIdx = createNumber("certificateFileIdx", java.math.BigInteger.class);

    public final NumberPath<Integer> distance = createNumber("distance", Integer.class);

    public final NumberPath<Integer> distanceScr = createNumber("distanceScr", Integer.class);

    public final StringPath distanceUnit = createString("distanceUnit");

    public final StringPath facGuide = createString("facGuide");

    public final StringPath facilities = createString("facilities");

    public final StringPath facOption = createString("facOption");

    public final StringPath facTimes = createString("facTimes");

    public final DateTimePath<java.sql.Timestamp> moddateEtc = createDateTime("moddateEtc", java.sql.Timestamp.class);

    public final StringPath notice = createString("notice");

    public final NumberPath<Long> placeIdx = createNumber("placeIdx", Long.class);

    public final StringPath promotion = createString("promotion");

    public final StringPath promotionStr = createString("promotionStr");

    public QPlaceEtc(String variable) {
        super(PlaceEtc.class, forVariable(variable));
    }

    public QPlaceEtc(Path<? extends PlaceEtc> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceEtc(PathMetadata metadata) {
        super(PlaceEtc.class, metadata);
    }

}

