package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberLikes is a Querydsl query type for MemberLikes
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberLikes extends EntityPathBase<MemberLikes> {

    private static final long serialVersionUID = 1790585681L;

    public static final QMemberLikes memberLikes = new QMemberLikes("memberLikes");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final StringPath likeStatus = createString("likeStatus");

    public final NumberPath<Long> memberIdx = createNumber("memberIdx", Long.class);

    public final DateTimePath<java.sql.Timestamp> moddate = createDateTime("moddate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public QMemberLikes(String variable) {
        super(MemberLikes.class, forVariable(variable));
    }

    public QMemberLikes(Path<? extends MemberLikes> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberLikes(PathMetadata metadata) {
        super(MemberLikes.class, metadata);
    }

}

