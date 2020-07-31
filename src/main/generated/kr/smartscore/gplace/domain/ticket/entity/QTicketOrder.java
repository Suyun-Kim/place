package kr.smartscore.gplace.domain.ticket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTicketOrder is a Querydsl query type for TicketOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTicketOrder extends EntityPathBase<TicketOrder> {

    private static final long serialVersionUID = 1599511551L;

    public static final QTicketOrder ticketOrder = new QTicketOrder("ticketOrder");

    public final DatePath<java.sql.Date> edate = createDate("edate", java.sql.Date.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> memberIdx = createNumber("memberIdx", Integer.class);

    public final NumberPath<Long> productIdx = createNumber("productIdx", Long.class);

    public final DatePath<java.sql.Date> sdate = createDate("sdate", java.sql.Date.class);

    public QTicketOrder(String variable) {
        super(TicketOrder.class, forVariable(variable));
    }

    public QTicketOrder(Path<? extends TicketOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTicketOrder(PathMetadata metadata) {
        super(TicketOrder.class, metadata);
    }

}

