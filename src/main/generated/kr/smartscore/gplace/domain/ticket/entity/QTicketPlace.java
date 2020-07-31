package kr.smartscore.gplace.domain.ticket.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTicketPlace is a Querydsl query type for TicketPlace
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTicketPlace extends EntityPathBase<TicketPlace> {

    private static final long serialVersionUID = 1600253368L;

    public static final QTicketPlace ticketPlace = new QTicketPlace("ticketPlace");

    public final NumberPath<Integer> availMonth = createNumber("availMonth", Integer.class);

    public final NumberPath<Integer> cloverRate = createNumber("cloverRate", Integer.class);

    public final StringPath comments = createString("comments");

    public final NumberPath<Integer> confirmStatus = createNumber("confirmStatus", Integer.class);

    public final DatePath<java.sql.Date> edate = createDate("edate", java.sql.Date.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> isClover = createNumber("isClover", Integer.class);

    public final NumberPath<Integer> isMulligan = createNumber("isMulligan", Integer.class);

    public final NumberPath<Integer> isWeekend = createNumber("isWeekend", Integer.class);

    public final DateTimePath<java.sql.Timestamp> moddate = createDateTime("moddate", java.sql.Timestamp.class);

    public final NumberPath<Long> placeIdx = createNumber("placeIdx", Long.class);

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> regisStatus = createNumber("regisStatus", Integer.class);

    public final NumberPath<Integer> salesRate = createNumber("salesRate", Integer.class);

    public final NumberPath<Integer> salesStatus = createNumber("salesStatus", Integer.class);

    public final DatePath<java.sql.Date> sdate = createDate("sdate", java.sql.Date.class);

    public final NumberPath<Integer> showStatus = createNumber("showStatus", Integer.class);

    public final DateTimePath<java.sql.Timestamp> statusDate = createDateTime("statusDate", java.sql.Timestamp.class);

    public final StringPath statusId = createString("statusId");

    public final StringPath statusReason = createString("statusReason");

    public final NumberPath<Integer> ticketRegis = createNumber("ticketRegis", Integer.class);

    public final NumberPath<Integer> ticketType = createNumber("ticketType", Integer.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final StringPath writerId = createString("writerId");

    public QTicketPlace(String variable) {
        super(TicketPlace.class, forVariable(variable));
    }

    public QTicketPlace(Path<? extends TicketPlace> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTicketPlace(PathMetadata metadata) {
        super(TicketPlace.class, metadata);
    }

}

