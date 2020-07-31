package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -265196757L;

    public static final QMember member = new QMember("member1");

    public final StringPath accStatus = createString("accStatus");

    public final StringPath address = createString("address");

    public final NumberPath<Integer> adPushAgreed = createNumber("adPushAgreed", Integer.class);

    public final StringPath appVer = createString("appVer");

    public final DateTimePath<java.sql.Timestamp> authDate = createDateTime("authDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> becomeDate = createDateTime("becomeDate", java.sql.Timestamp.class);

    public final StringPath bgImg = createString("bgImg");

    public final DatePath<java.sql.Date> birthDay = createDate("birthDay", java.sql.Date.class);

    public final NumberPath<Long> blackIdx = createNumber("blackIdx", Long.class);

    public final NumberPath<Integer> caddleIdx = createNumber("caddleIdx", Integer.class);

    public final StringPath cloverSymbol = createString("cloverSymbol");

    public final NumberPath<Integer> clubIdx = createNumber("clubIdx", Integer.class);

    public final StringPath clubMemberYn = createString("clubMemberYn");

    public final StringPath country = createString("country");

    public final StringPath deviceModel = createString("deviceModel");

    public final StringPath deviceOsVer = createString("deviceOsVer");

    public final StringPath deviceType = createString("deviceType");

    public final StringPath email = createString("email");

    public final StringPath emailAuth = createString("emailAuth");

    public final StringPath gender = createString("gender");

    public final NumberPath<Integer> handicap = createNumber("handicap", Integer.class);

    public final NumberPath<Integer> handicapEditCnt = createNumber("handicapEditCnt", Integer.class);

    public final DateTimePath<java.sql.Timestamp> handicapEditDate = createDateTime("handicapEditDate", java.sql.Timestamp.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final NumberPath<Integer> isAllowEmailNoti = createNumber("isAllowEmailNoti", Integer.class);

    public final NumberPath<Integer> isAllowGolfFrd = createNumber("isAllowGolfFrd", Integer.class);

    public final NumberPath<Integer> isAutosyncFrdList = createNumber("isAutosyncFrdList", Integer.class);

    public final NumberPath<Integer> isBlockAllFriend = createNumber("isBlockAllFriend", Integer.class);

    public final NumberPath<Integer> isOpenMonthlyRank = createNumber("isOpenMonthlyRank", Integer.class);

    public final NumberPath<Integer> isOpenScore = createNumber("isOpenScore", Integer.class);

    public final StringPath isPro = createString("isPro");

    public final DateTimePath<java.sql.Timestamp> isPushDate = createDateTime("isPushDate", java.sql.Timestamp.class);

    public final StringPath isPushItem = createString("isPushItem");

    public final NumberPath<Integer> isPushSilentEnd = createNumber("isPushSilentEnd", Integer.class);

    public final NumberPath<Integer> isPushSilentStart = createNumber("isPushSilentStart", Integer.class);

    public final StringPath isPushType = createString("isPushType");

    public final DateTimePath<java.sql.Timestamp> lastPbSyncDate = createDateTime("lastPbSyncDate", java.sql.Timestamp.class);

    public final DatePath<java.sql.Date> lastVisitDate = createDate("lastVisitDate", java.sql.Date.class);

    public final NumberPath<Float> legnth = createNumber("legnth", Float.class);

    public final StringPath marry = createString("marry");

    public final StringPath membership = createString("membership");

    public final DateTimePath<java.sql.Timestamp> membershipEdDt = createDateTime("membershipEdDt", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> membershipStDt = createDateTime("membershipStDt", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> outDate = createDateTime("outDate", java.sql.Timestamp.class);

    public final StringPath password = createString("password");

    public final StringPath pending = createString("pending");

    public final StringPath phoneAuth = createString("phoneAuth");

    public final StringPath phoneKey = createString("phoneKey");

    public final StringPath phoneModel = createString("phoneModel");

    public final StringPath phoneOs = createString("phoneOs");

    public final NumberPath<Integer> pointGet = createNumber("pointGet", Integer.class);

    public final NumberPath<Integer> pointUse = createNumber("pointUse", Integer.class);

    public final StringPath profileImg = createString("profileImg");

    public final StringPath pushAgreed = createString("pushAgreed");

    public final StringPath regChannel = createString("regChannel");

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> rndSelfCnt = createNumber("rndSelfCnt", Integer.class);

    public final NumberPath<Integer> rndTabletCnt = createNumber("rndTabletCnt", Integer.class);

    public final NumberPath<Integer> rndTypeCnt = createNumber("rndTypeCnt", Integer.class);

    public final StringPath roundExposed = createString("roundExposed");

    public final NumberPath<Integer> roundingCnt = createNumber("roundingCnt", Integer.class);

    public final StringPath roundingOpenType = createString("roundingOpenType");

    public final DateTimePath<java.sql.Timestamp> roundingOpenTypeDate = createDateTime("roundingOpenTypeDate", java.sql.Timestamp.class);

    public final StringPath roundLock = createString("roundLock");

    public final StringPath roundStatus = createString("roundStatus");

    public final DateTimePath<java.sql.Timestamp> tabletRegDate = createDateTime("tabletRegDate", java.sql.Timestamp.class);

    public final StringPath thumb = createString("thumb");

    public final StringPath timelineFriendOpenType = createString("timelineFriendOpenType");

    public final StringPath timelineOpenType = createString("timelineOpenType");

    public final StringPath timelinePhotoOpenType = createString("timelinePhotoOpenType");

    public final StringPath user_gu = createString("user_gu");

    public final NumberPath<Integer> userAge = createNumber("userAge", Integer.class);

    public final StringPath userName = createString("userName");

    public final StringPath userNick = createString("userNick");

    public final StringPath userPhone = createString("userPhone");

    public final StringPath userSi = createString("userSi");

    public final NumberPath<Float> weight = createNumber("weight", Float.class);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

