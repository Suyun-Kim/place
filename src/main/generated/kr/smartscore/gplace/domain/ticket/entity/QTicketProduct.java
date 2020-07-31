package kr.smartscore.gplace.domain.ticket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTicketProduct is a Querydsl query type for TicketProduct
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTicketProduct extends EntityPathBase<TicketProduct> {

    private static final long serialVersionUID = 429947232L;

    public static final QTicketProduct ticketProduct = new QTicketProduct("ticketProduct");

    public final NumberPath<Integer> availCount = createNumber("availCount", Integer.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> maxCount = createNumber("maxCount", Integer.class);

    public final DateTimePath<java.sql.Timestamp> moddate = createDateTime("moddate", java.sql.Timestamp.class);

    public final StringPath options = createString("options");

    public final NumberPath<Integer> priceOri = createNumber("priceOri", Integer.class);

    public final NumberPath<Integer> priceRate = createNumber("priceRate", Integer.class);

    public final NumberPath<Integer> priceSales = createNumber("priceSales", Integer.class);

    public final NumberPath<Integer> priceSupply = createNumber("priceSupply", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> salesCount = createNumber("salesCount", Integer.class);

    public final NumberPath<Integer> showStatus = createNumber("showStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> statusDate = createDateTime("statusDate", java.sql.Timestamp.class);

    public final StringPath statusId = createString("statusId");

    public final NumberPath<Long> ticketIdx = createNumber("ticketIdx", Long.class);

    public final StringPath ticketName = createString("ticketName");

    public final NumberPath<Integer> ticketValue = createNumber("ticketValue", Integer.class);

    public final NumberPath<Integer> totalCount = createNumber("totalCount", Integer.class);

    public final NumberPath<Integer> useStatus = createNumber("useStatus", Integer.class);

    public final StringPath writerId = createString("writerId");

    public QTicketProduct(String variable) {
        super(TicketProduct.class, forVariable(variable));
    }

    public QTicketProduct(Path<? extends TicketProduct> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTicketProduct(PathMetadata metadata) {
        super(TicketProduct.class, metadata);
    }

}

