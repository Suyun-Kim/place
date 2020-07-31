package kr.smartscore.gplace.domain.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderRefund is a Querydsl query type for OrderRefund
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderRefund extends EntityPathBase<OrderRefund> {

    private static final long serialVersionUID = 336297141L;

    public static final QOrderRefund orderRefund = new QOrderRefund("orderRefund");

    public final StringPath bankAccount = createString("bankAccount");

    public final DateTimePath<java.sql.Timestamp> bankExpried = createDateTime("bankExpried", java.sql.Timestamp.class);

    public final StringPath bankName = createString("bankName");

    public final StringPath bankOwner = createString("bankOwner");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final DateTimePath<java.sql.Timestamp> moddate = createDateTime("moddate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> rfdAmount = createNumber("rfdAmount", Integer.class);

    public final StringPath rfdError = createString("rfdError");

    public final NumberPath<Integer> rfdMethod = createNumber("rfdMethod", Integer.class);

    public final NumberPath<Integer> rfdMulligan = createNumber("rfdMulligan", Integer.class);

    public final NumberPath<java.math.BigInteger> rfdMulliganIdx = createNumber("rfdMulliganIdx", java.math.BigInteger.class);

    public final NumberPath<Integer> rfdPoint = createNumber("rfdPoint", Integer.class);

    public final NumberPath<Integer> rfdStatus = createNumber("rfdStatus", Integer.class);

    public final StringPath rfdTid = createString("rfdTid");

    public final NumberPath<Integer> rfdTotal = createNumber("rfdTotal", Integer.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public final NumberPath<Integer> withdrawPoint = createNumber("withdrawPoint", Integer.class);

    public QOrderRefund(String variable) {
        super(OrderRefund.class, forVariable(variable));
    }

    public QOrderRefund(Path<? extends OrderRefund> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderRefund(PathMetadata metadata) {
        super(OrderRefund.class, metadata);
    }

}

