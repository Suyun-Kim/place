package kr.smartscore.gplace.domain.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonHistories is a Querydsl query type for CommonHistories
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommonHistories extends EntityPathBase<CommonHistories> {

    private static final long serialVersionUID = 228177573L;

    public static final QCommonHistories commonHistories = new QCommonHistories("commonHistories");

    public final StringPath asisJson = createString("asisJson");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final StringPath is1st = createString("is1st");

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Integer> targetIdx = createNumber("targetIdx", Integer.class);

    public final StringPath tobeJson = createString("tobeJson");

    public final StringPath writerId = createString("writerId");

    public QCommonHistories(String variable) {
        super(CommonHistories.class, forVariable(variable));
    }

    public QCommonHistories(Path<? extends CommonHistories> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonHistories(PathMetadata metadata) {
        super(CommonHistories.class, metadata);
    }

}

