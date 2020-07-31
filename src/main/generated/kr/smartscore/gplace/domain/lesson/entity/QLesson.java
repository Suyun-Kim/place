package kr.smartscore.gplace.domain.lesson.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLesson is a Querydsl query type for Lesson
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLesson extends EntityPathBase<Lesson> {

    private static final long serialVersionUID = 1708508135L;

    public static final QLesson lesson = new QLesson("lesson");

    public final NumberPath<java.math.BigDecimal> avgScore = createNumber("avgScore", java.math.BigDecimal.class);

    public final StringPath careers = createString("careers");

    public final NumberPath<java.math.BigInteger> certificateFileIdx = createNumber("certificateFileIdx", java.math.BigInteger.class);

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> isCertificate = createNumber("isCertificate", Integer.class);

    public final NumberPath<Integer> isOnline = createNumber("isOnline", Integer.class);

    public final StringPath lessonInfo = createString("lessonInfo");

    public final NumberPath<Integer> lessonStatus = createNumber("lessonStatus", Integer.class);

    public final StringPath lessonTimes = createString("lessonTimes");

    public final DateTimePath<java.sql.Timestamp> moddate = createDateTime("moddate", java.sql.Timestamp.class);

    public final StringPath phone1 = createString("phone1");

    public final StringPath phone2 = createString("phone2");

    public final NumberPath<Long> placeIdx = createNumber("placeIdx", Long.class);

    public final StringPath prMemo = createString("prMemo");

    public final NumberPath<java.math.BigInteger> profileImgIdx = createNumber("profileImgIdx", java.math.BigInteger.class);

    public final NumberPath<Integer> proGrade = createNumber("proGrade", Integer.class);

    public final StringPath promotionStr = createString("promotionStr");

    public final StringPath proName = createString("proName");

    public final NumberPath<Integer> proYears = createNumber("proYears", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> showStatus = createNumber("showStatus", Integer.class);

    public final NumberPath<Integer> viewCount = createNumber("viewCount", Integer.class);

    public final NumberPath<Integer> zzimCount = createNumber("zzimCount", Integer.class);

    public QLesson(String variable) {
        super(Lesson.class, forVariable(variable));
    }

    public QLesson(Path<? extends Lesson> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLesson(PathMetadata metadata) {
        super(Lesson.class, metadata);
    }

}

