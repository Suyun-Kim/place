package kr.smartscore.gplace.domain.advertising.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdvertising is a Querydsl query type for Advertising
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdvertising extends EntityPathBase<Advertising> {

    private static final long serialVersionUID = 529222749L;

    public static final QAdvertising advertising = new QAdvertising("advertising");

    public final StringPath advType = createString("advType");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> unitFee1 = createNumber("unitFee1", Integer.class);

    public final NumberPath<Integer> unitFee2 = createNumber("unitFee2", Integer.class);

    public final NumberPath<Integer> unitTerm = createNumber("unitTerm", Integer.class);

    public final StringPath writer_id = createString("writer_id");

    public QAdvertising(String variable) {
        super(Advertising.class, forVariable(variable));
    }

    public QAdvertising(Path<? extends Advertising> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdvertising(PathMetadata metadata) {
        super(Advertising.class, metadata);
    }

}

