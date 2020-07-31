package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberReview is a Querydsl query type for MemberReview
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberReview extends EntityPathBase<MemberReview> {

    private static final long serialVersionUID = -158006685L;

    public static final QMemberReview memberReview = new QMemberReview("memberReview");

    public final StringPath comment = createString("comment");

    public final NumberPath<Integer> dislikes = createNumber("dislikes", Integer.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> likes = createNumber("likes", Integer.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final StringPath reply = createString("reply");

    public final DateTimePath<java.sql.Timestamp> replyDate = createDateTime("replyDate", java.sql.Timestamp.class);

    public final StringPath replyId = createString("replyId");

    public final NumberPath<java.math.BigDecimal> scoreAvg = createNumber("scoreAvg", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> scoreItem1 = createNumber("scoreItem1", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> scoreItem2 = createNumber("scoreItem2", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> scoreItem3 = createNumber("scoreItem3", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> scoreItem4 = createNumber("scoreItem4", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> scoreItem5 = createNumber("scoreItem5", java.math.BigDecimal.class);

    public final NumberPath<Integer> showStatus = createNumber("showStatus", Integer.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public QMemberReview(String variable) {
        super(MemberReview.class, forVariable(variable));
    }

    public QMemberReview(Path<? extends MemberReview> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberReview(PathMetadata metadata) {
        super(MemberReview.class, metadata);
    }

}

