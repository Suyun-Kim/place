package kr.smartscore.gplace.domain.place.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceRegis is a Querydsl query type for PlaceRegis
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlaceRegis extends EntityPathBase<PlaceRegis> {

    private static final long serialVersionUID = 1455736641L;

    public static final QPlaceRegis placeRegis = new QPlaceRegis("placeRegis");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final StringPath isLast = createString("isLast");

    public final NumberPath<Integer> placeGrade = createNumber("placeGrade", Integer.class);

    public final NumberPath<Long> placeIdx = createNumber("placeIdx", Long.class);

    public final NumberPath<Integer> placeItems = createNumber("placeItems", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> regisStatus = createNumber("regisStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> statusDate = createDateTime("statusDate", java.sql.Timestamp.class);

    public final StringPath statusId = createString("statusId");

    public final StringPath statusReason = createString("statusReason");

    public final StringPath writerId = createString("writerId");

    public QPlaceRegis(String variable) {
        super(PlaceRegis.class, forVariable(variable));
    }

    public QPlaceRegis(Path<? extends PlaceRegis> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceRegis(PathMetadata metadata) {
        super(PlaceRegis.class, metadata);
    }

}

