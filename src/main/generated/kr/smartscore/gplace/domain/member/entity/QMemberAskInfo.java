package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberAskInfo is a Querydsl query type for MemberAskInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberAskInfo extends EntityPathBase<MemberAskInfo> {

    private static final long serialVersionUID = 1878770972L;

    public static final QMemberAskInfo memberAskInfo = new QMemberAskInfo("memberAskInfo");

    public final StringPath askinfo = createString("askinfo");

    public final NumberPath<Integer> askResult = createNumber("askResult", Integer.class);

    public final NumberPath<Integer> askStatus = createNumber("askStatus", Integer.class);

    public final NumberPath<java.math.BigInteger> attachFileIdx = createNumber("attachFileIdx", java.math.BigInteger.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final StringPath memo = createString("memo");

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> statusDate = createDateTime("statusDate", java.sql.Timestamp.class);

    public final StringPath statusId = createString("statusId");

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public final StringPath title = createString("title");

    public QMemberAskInfo(String variable) {
        super(MemberAskInfo.class, forVariable(variable));
    }

    public QMemberAskInfo(Path<? extends MemberAskInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberAskInfo(PathMetadata metadata) {
        super(MemberAskInfo.class, metadata);
    }

}

