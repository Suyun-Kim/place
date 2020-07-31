package kr.smartscore.gplace.domain.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonMenu is a Querydsl query type for CommonMenu
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommonMenu extends EntityPathBase<CommonMenu> {

    private static final long serialVersionUID = 1521271564L;

    public static final QCommonMenu commonMenu = new QCommonMenu("commonMenu");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final StringPath isShow = createString("isShow");

    public final NumberPath<Integer> menu = createNumber("menu", Integer.class);

    public final NumberPath<Integer> orderSeq = createNumber("orderSeq", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public final StringPath writerId = createString("writerId");

    public QCommonMenu(String variable) {
        super(CommonMenu.class, forVariable(variable));
    }

    public QCommonMenu(Path<? extends CommonMenu> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonMenu(PathMetadata metadata) {
        super(CommonMenu.class, metadata);
    }

}

