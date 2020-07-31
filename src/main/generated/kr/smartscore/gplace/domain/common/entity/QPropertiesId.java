package kr.smartscore.gplace.domain.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPropertiesId is a Querydsl query type for PropertiesId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QPropertiesId extends BeanPath<PropertiesId> {

    private static final long serialVersionUID = 841634384L;

    public static final QPropertiesId propertiesId = new QPropertiesId("propertiesId");

    public final StringPath properties_code = createString("properties_code");

    public final StringPath target = createString("target");

    public QPropertiesId(String variable) {
        super(PropertiesId.class, forVariable(variable));
    }

    public QPropertiesId(Path<? extends PropertiesId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPropertiesId(PathMetadata metadata) {
        super(PropertiesId.class, metadata);
    }

}

