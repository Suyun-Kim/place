package kr.smartscore.gplace.domain.lesson.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLessonRegis is a Querydsl query type for LessonRegis
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLessonRegis extends EntityPathBase<LessonRegis> {

    private static final long serialVersionUID = 1194235159L;

    public static final QLessonRegis lessonRegis = new QLessonRegis("lessonRegis");

    public final NumberPath<Long> changePlaceIdx = createNumber("changePlaceIdx", Long.class);

    public final StringPath comments = createString("comments");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Long> lessonIdx = createNumber("lessonIdx", Long.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> regisStatus = createNumber("regisStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> statusDate = createDateTime("statusDate", java.sql.Timestamp.class);

    public final StringPath statusId = createString("statusId");

    public final StringPath statusReason = createString("statusReason");

    public final StringPath writerId = createString("writerId");

    public QLessonRegis(String variable) {
        super(LessonRegis.class, forVariable(variable));
    }

    public QLessonRegis(Path<? extends LessonRegis> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLessonRegis(PathMetadata metadata) {
        super(LessonRegis.class, metadata);
    }

}

