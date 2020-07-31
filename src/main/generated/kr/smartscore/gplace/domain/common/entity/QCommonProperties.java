package kr.smartscore.gplace.domain.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonProperties is a Querydsl query type for CommonProperties
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommonProperties extends EntityPathBase<CommonProperties> {

    private static final long serialVersionUID = -98073312L;

    public static final QCommonProperties commonProperties = new QCommonProperties("commonProperties");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final StringPath memo = createString("memo");

    public final NumberPath<Integer> orderSeq = createNumber("orderSeq", Integer.class);

    public final NumberPath<Integer> propertiesCode = createNumber("propertiesCode", Integer.class);

    public final StringPath propertiesName = createString("propertiesName");

    public final NumberPath<Integer> propertiesValue = createNumber("propertiesValue", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final StringPath target = createString("target");

    public final StringPath writerId = createString("writerId");

    public QCommonProperties(String variable) {
        super(CommonProperties.class, forVariable(variable));
    }

    public QCommonProperties(Path<? extends CommonProperties> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonProperties(PathMetadata metadata) {
        super(CommonProperties.class, metadata);
    }

}

