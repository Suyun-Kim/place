package kr.smartscore.gplace.domain.user.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdmin is a Querydsl query type for Admin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdmin extends EntityPathBase<Admin> {

    private static final long serialVersionUID = -1939667827L;

    public static final QAdmin admin = new QAdmin("admin");

    public final StringPath dept = createString("dept");

    public final StringPath dirPhone = createString("dirPhone");

    public final StringPath id = createString("id");

    public final NumberPath<Integer> idx = createNumber("idx", Integer.class);

    public final StringPath klcnsId = createString("klcnsId");

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    public final DateTimePath<java.sql.Timestamp> loginDate = createDateTime("loginDate", java.sql.Timestamp.class);

    public final NumberPath<Long> loginFailCnt = createNumber("loginFailCnt", Long.class);

    public final DateTimePath<java.sql.Timestamp> loginFailDate = createDateTime("loginFailDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> loginUnblockDate = createDateTime("loginUnblockDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> manageClub = createNumber("manageClub", Integer.class);

    public final NumberPath<Integer> manageShop = createNumber("manageShop", Integer.class);

    public final DateTimePath<java.sql.Timestamp> passModify = createDateTime("passModify", java.sql.Timestamp.class);

    public final StringPath password = createString("password");

    public final StringPath pending = createString("pending");

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final StringPath userEmail = createString("userEmail");

    public final StringPath userName = createString("userName");

    public final StringPath userPhone = createString("userPhone");

    public QAdmin(String variable) {
        super(Admin.class, forVariable(variable));
    }

    public QAdmin(Path<? extends Admin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdmin(PathMetadata metadata) {
        super(Admin.class, metadata);
    }

}

