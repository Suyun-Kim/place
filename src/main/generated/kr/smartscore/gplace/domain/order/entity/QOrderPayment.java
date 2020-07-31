package kr.smartscore.gplace.domain.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderPayment is a Querydsl query type for OrderPayment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderPayment extends EntityPathBase<OrderPayment> {

    private static final long serialVersionUID = -36946839L;

    public static final QOrderPayment orderPayment = new QOrderPayment("orderPayment");

    public final StringPath bankAccount = createString("bankAccount");

    public final StringPath bankExpired = createString("bankExpired");

    public final StringPath bankName = createString("bankName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final DateTimePath<java.sql.Timestamp> moddate = createDateTime("moddate", java.sql.Timestamp.class);

    public final NumberPath<Integer> payAmount = createNumber("payAmount", Integer.class);

    public final DateTimePath<java.sql.Timestamp> payDate = createDateTime("payDate", java.sql.Timestamp.class);

    public final StringPath payerName = createString("payerName");

    public final StringPath payError = createString("payError");

    public final NumberPath<Integer> payMethod = createNumber("payMethod", Integer.class);

    public final NumberPath<Integer> payMulligan = createNumber("payMulligan", Integer.class);

    public final NumberPath<java.math.BigInteger> payMulliganIdx = createNumber("payMulliganIdx", java.math.BigInteger.class);

    public final NumberPath<Integer> payPoint = createNumber("payPoint", Integer.class);

    public final NumberPath<Integer> payStatus = createNumber("payStatus", Integer.class);

    public final StringPath payTid = createString("payTid");

    public final NumberPath<Integer> payTotal = createNumber("payTotal", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> target = createNumber("target", Integer.class);

    public final NumberPath<Long> targetIdx = createNumber("targetIdx", Long.class);

    public QOrderPayment(String variable) {
        super(OrderPayment.class, forVariable(variable));
    }

    public QOrderPayment(Path<? extends OrderPayment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderPayment(PathMetadata metadata) {
        super(OrderPayment.class, metadata);
    }

}

