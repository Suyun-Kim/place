package kr.smartscore.gplace.domain.place.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QplaceAdvertisingClaim is a Querydsl query type for placeAdvertisingClaim
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QplaceAdvertisingClaim extends EntityPathBase<placeAdvertisingClaim> {

    private static final long serialVersionUID = -1717210827L;

    public static final QplaceAdvertisingClaim placeAdvertisingClaim = new QplaceAdvertisingClaim("placeAdvertisingClaim");

    public final NumberPath<Integer> claimReason = createNumber("claimReason", Integer.class);

    public final NumberPath<Integer> claimType = createNumber("claimType", Integer.class);

    public final NumberPath<Integer> clmStatus = createNumber("clmStatus", Integer.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Long> placeAdvertisingIdx = createNumber("placeAdvertisingIdx", Long.class);

    public final StringPath refundAccount = createString("refundAccount");

    public final NumberPath<Integer> refundAmount = createNumber("refundAmount", Integer.class);

    public final StringPath refundBank = createString("refundBank");

    public final StringPath refundName = createString("refundName");

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> statusDate = createDateTime("statusDate", java.sql.Timestamp.class);

    public final StringPath statusId = createString("statusId");

    public final StringPath statusReason = createString("statusReason");

    public final StringPath writerId = createString("writerId");

    public QplaceAdvertisingClaim(String variable) {
        super(placeAdvertisingClaim.class, forVariable(variable));
    }

    public QplaceAdvertisingClaim(Path<? extends placeAdvertisingClaim> path) {
        super(path.getType(), path.getMetadata());
    }

    public QplaceAdvertisingClaim(PathMetadata metadata) {
        super(placeAdvertisingClaim.class, metadata);
    }

}

