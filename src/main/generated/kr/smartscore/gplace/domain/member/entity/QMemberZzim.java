package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberZzim is a Querydsl query type for MemberZzim
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberZzim extends EntityPathBase<MemberZzim> {

    private static final long serialVersionUID = 1443667503L;

    public static final QMemberZzim memberZzim = new QMemberZzim("memberZzim");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final DateTimePath<java.sql.Timestamp> moddate = createDateTime("moddate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public final StringPath zzimStatus = createString("zzimStatus");

    public QMemberZzim(String variable) {
        super(MemberZzim.class, forVariable(variable));
    }

    public QMemberZzim(Path<? extends MemberZzim> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberZzim(PathMetadata metadata) {
        super(MemberZzim.class, metadata);
    }

}

