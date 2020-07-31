package kr.smartscore.gplace.domain.lesson.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLessonVideo is a Querydsl query type for LessonVideo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLessonVideo extends EntityPathBase<LessonVideo> {

    private static final long serialVersionUID = 1198045396L;

    public static final QLessonVideo lessonVideo = new QLessonVideo("lessonVideo");

    public final NumberPath<Integer> category = createNumber("category", Integer.class);

    public final StringPath contents = createString("contents");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Long> lessonIdx = createNumber("lessonIdx", Long.class);

    public final NumberPath<Integer> likesCount = createNumber("likesCount", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> replyCount = createNumber("replyCount", Integer.class);

    public final NumberPath<Integer> showStatus = createNumber("showStatus", Integer.class);

    public final StringPath tags = createString("tags");

    public final StringPath title = createString("title");

    public final NumberPath<java.math.BigInteger> videoFileIdx = createNumber("videoFileIdx", java.math.BigInteger.class);

    public final NumberPath<Integer> viewCount = createNumber("viewCount", Integer.class);

    public final StringPath writerId = createString("writerId");

    public QLessonVideo(String variable) {
        super(LessonVideo.class, forVariable(variable));
    }

    public QLessonVideo(Path<? extends LessonVideo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLessonVideo(PathMetadata metadata) {
        super(LessonVideo.class, metadata);
    }

}

