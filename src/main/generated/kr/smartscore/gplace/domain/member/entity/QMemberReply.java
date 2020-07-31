package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberReply is a Querydsl query type for MemberReply
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberReply extends EntityPathBase<MemberReply> {

    private static final long serialVersionUID = 1796012671L;

    public static final QMemberReply memberReply = new QMemberReply("memberReply");

    public final StringPath comment = createString("comment");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> showStatus = createNumber("showStatus", Integer.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public QMemberReply(String variable) {
        super(MemberReply.class, forVariable(variable));
    }

    public QMemberReply(Path<? extends MemberReply> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberReply(PathMetadata metadata) {
        super(MemberReply.class, metadata);
    }

}

