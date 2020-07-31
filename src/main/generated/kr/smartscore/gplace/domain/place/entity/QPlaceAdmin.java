package kr.smartscore.gplace.domain.place.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceAdmin is a Querydsl query type for PlaceAdmin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlaceAdmin extends EntityPathBase<PlaceAdmin> {

    private static final long serialVersionUID = 1440012754L;

    public static final QPlaceAdmin placeAdmin = new QPlaceAdmin("placeAdmin");

    public final NumberPath<Integer> accountIdx = createNumber("accountIdx", Integer.class);

    public final StringPath adminType = createString("adminType");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Long> lessonIdx = createNumber("lessonIdx", Long.class);

    public final NumberPath<Long> placeIdx = createNumber("placeIdx", Long.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public QPlaceAdmin(String variable) {
        super(PlaceAdmin.class, forVariable(variable));
    }

    public QPlaceAdmin(Path<? extends PlaceAdmin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceAdmin(PathMetadata metadata) {
        super(PlaceAdmin.class, metadata);
    }

}

