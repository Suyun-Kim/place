package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberView is a Querydsl query type for MemberView
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberView extends EntityPathBase<MemberView> {

    private static final long serialVersionUID = 1443531888L;

    public static final QMemberView memberView = new QMemberView("memberView");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final DatePath<java.sql.Date> lastday = createDate("lastday", java.sql.Date.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public final NumberPath<Integer> viewCount = createNumber("viewCount", Integer.class);

    public QMemberView(String variable) {
        super(MemberView.class, forVariable(variable));
    }

    public QMemberView(Path<? extends MemberView> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberView(PathMetadata metadata) {
        super(MemberView.class, metadata);
    }

}

