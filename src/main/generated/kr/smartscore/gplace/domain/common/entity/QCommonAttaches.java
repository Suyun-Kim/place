package kr.smartscore.gplace.domain.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonAttaches is a Querydsl query type for CommonAttaches
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommonAttaches extends EntityPathBase<CommonAttaches> {

    private static final long serialVersionUID = 628985056L;

    public static final QCommonAttaches commonAttaches = new QCommonAttaches("commonAttaches");

    public final NumberPath<Integer> category = createNumber("category", Integer.class);

    public final StringPath contents = createString("contents");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigInteger> sourceIdx = createNumber("sourceIdx", java.math.BigInteger.class);

    public final StringPath sourceType = createString("sourceType");

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    public QCommonAttaches(String variable) {
        super(CommonAttaches.class, forVariable(variable));
    }

    public QCommonAttaches(Path<? extends CommonAttaches> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonAttaches(PathMetadata metadata) {
        super(CommonAttaches.class, metadata);
    }

}

