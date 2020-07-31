package kr.smartscore.gplace.domain.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberExtraInfo is a Querydsl query type for MemberExtraInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberExtraInfo extends EntityPathBase<MemberExtraInfo> {

    private static final long serialVersionUID = -639567373L;

    public static final QMemberExtraInfo memberExtraInfo = new QMemberExtraInfo("memberExtraInfo");

    public final StringPath certificateModDate = createString("certificateModDate");

    public final StringPath certificateType = createString("certificateType");

    public final StringPath extraAddress1 = createString("extraAddress1");

    public final StringPath extraAddress2 = createString("extraAddress2");

    public final NumberPath<Integer> isAdSms = createNumber("isAdSms", Integer.class);

    public final StringPath isCaddiebagOpen = createString("isCaddiebagOpen");

    public final StringPath isLocationAgree = createString("isLocationAgree");

    public final StringPath isNetworkNotice = createString("isNetworkNotice");

    public final StringPath isOpenAddress = createString("isOpenAddress");

    public final StringPath isOpenBirthday = createString("isOpenBirthday");

    public final StringPath isOpenEmail = createString("isOpenEmail");

    public final StringPath isPrivacyAgree = createString("isPrivacyAgree");

    public final NumberPath<Integer> isPushManner = createNumber("isPushManner", Integer.class);

    public final StringPath isTermConfirm = createString("isTermConfirm");

    public final StringPath isTermsAgree = createString("isTermsAgree");

    public final StringPath isThirdPartyAgree = createString("isThirdPartyAgree");

    public final StringPath isVideoContinuePlay = createString("isVideoContinuePlay");

    public final StringPath kcmuserName = createString("kcmuserName");

    public final DateTimePath<java.sql.Timestamp> lastPushreadTime = createDateTime("lastPushreadTime", java.sql.Timestamp.class);

    public final NumberPath<Long> loginFailCnt = createNumber("loginFailCnt", Long.class);

    public final DateTimePath<java.sql.Timestamp> loginFailDate = createDateTime("loginFailDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> loginUnblockDate = createDateTime("loginUnblockDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> nameAuth = createDateTime("nameAuth", java.sql.Timestamp.class);

    public final StringPath postcode = createString("postcode");

    public final StringPath serviceListPushYn = createString("serviceListPushYn");

    public final StringPath sessionEncKey = createString("sessionEncKey");

    public final StringPath sessionEncKeyPc = createString("sessionEncKeyPc");

    public final StringPath teamInvite = createString("teamInvite");

    public final StringPath teamPush = createString("teamPush");

    public final StringPath userCi = createString("userCi");

    public final StringPath userDi = createString("userDi");

    public final NumberPath<Long> userIdx = createNumber("userIdx", Long.class);

    public final StringPath userNation = createString("userNation");

    public QMemberExtraInfo(String variable) {
        super(MemberExtraInfo.class, forVariable(variable));
    }

    public QMemberExtraInfo(Path<? extends MemberExtraInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberExtraInfo(PathMetadata metadata) {
        super(MemberExtraInfo.class, metadata);
    }

}

