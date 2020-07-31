package kr.smartscore.gplace.domain.place.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceAdvertisingArea is a Querydsl query type for PlaceAdvertisingArea
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlaceAdvertisingArea extends EntityPathBase<PlaceAdvertisingArea> {

    private static final long serialVersionUID = 1388951700L;

    public static final QPlaceAdvertisingArea placeAdvertisingArea = new QPlaceAdvertisingArea("placeAdvertisingArea");

    public final StringPath gugun = createString("gugun");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Long> placeAadvertisingIdx = createNumber("placeAadvertisingIdx", Long.class);

    public final StringPath sido = createString("sido");

    public QPlaceAdvertisingArea(String variable) {
        super(PlaceAdvertisingArea.class, forVariable(variable));
    }

    public QPlaceAdvertisingArea(Path<? extends PlaceAdvertisingArea> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceAdvertisingArea(PathMetadata metadata) {
        super(PlaceAdvertisingArea.class, metadata);
    }

}

