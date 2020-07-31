package kr.smartscore.gplace.domain.place.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceAdvertising is a Querydsl query type for PlaceAdvertising
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlaceAdvertising extends EntityPathBase<PlaceAdvertising> {

    private static final long serialVersionUID = 1784053607L;

    public static final QPlaceAdvertising placeAdvertising = new QPlaceAdvertising("placeAdvertising");

    public final NumberPath<Long> advertisingIdx = createNumber("advertisingIdx", Long.class);

    public final NumberPath<Integer> advMenu = createNumber("advMenu", Integer.class);

    public final NumberPath<Integer> advTarget = createNumber("advTarget", Integer.class);

    public final NumberPath<Long> advTargetIdx = createNumber("advTargetIdx", Long.class);

    public final DateTimePath<java.sql.Timestamp> edate = createDateTime("edate", java.sql.Timestamp.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final StringPath memo = createString("memo");

    public final NumberPath<Integer> payAmount = createNumber("payAmount", Integer.class);

    public final NumberPath<Long> placeIdx = createNumber("placeIdx", Long.class);

    public final NumberPath<Integer> priceOri = createNumber("priceOri", Integer.class);

    public final NumberPath<Integer> priceRate = createNumber("priceRate", Integer.class);

    public final NumberPath<Integer> priceSales = createNumber("priceSales", Integer.class);

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final NumberPath<Integer> refundAmount = createNumber("refundAmount", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> regiStatus = createNumber("regiStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> sdate = createDateTime("sdate", java.sql.Timestamp.class);

    public final StringPath showStatus = createString("showStatus");

    public final DateTimePath<java.sql.Timestamp> statusDate = createDateTime("statusDate", java.sql.Timestamp.class);

    public final StringPath statusId = createString("statusId");

    public final StringPath writerId = createString("writerId");

    public QPlaceAdvertising(String variable) {
        super(PlaceAdvertising.class, forVariable(variable));
    }

    public QPlaceAdvertising(Path<? extends PlaceAdvertising> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceAdvertising(PathMetadata metadata) {
        super(PlaceAdvertising.class, metadata);
    }

}

