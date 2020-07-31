package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberQna is a Querydsl query type for MemberQna
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberQna extends EntityPathBase<MemberQna> {

    private static final long serialVersionUID = -2031649095L;

    public static final QMemberQna memberQna = new QMemberQna("memberQna");

    public final StringPath answer = createString("answer");

    public final StringPath answerId = createString("answerId");

    public final NumberPath<java.math.BigInteger> attachFileIdx = createNumber("attachFileIdx", java.math.BigInteger.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> isSecret = createNumber("isSecret", Integer.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final NumberPath<Long> parentIdx = createNumber("parentIdx", Long.class);

    public final NumberPath<Integer> qnaStatus = createNumber("qnaStatus", Integer.class);

    public final StringPath question = createString("question");

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> showStatus = createNumber("showStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> statusDate = createDateTime("statusDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public final StringPath title = createString("title");

    public QMemberQna(String variable) {
        super(MemberQna.class, forVariable(variable));
    }

    public QMemberQna(Path<? extends MemberQna> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberQna(PathMetadata metadata) {
        super(MemberQna.class, metadata);
    }

}

