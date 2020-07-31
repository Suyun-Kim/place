package kr.smartscore.gplace.domain.common.code.place;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

/**
 * 제휴상품판매방식
 */
public enum SalesType implements EnumMapperType {
    GENERAL(0,"N/A"),
    MEDIATION(1,"판매중개"),
    CONSIGNMENT(2,"위탁판매");

    private int code;
    private String title;

    SalesType(int code, String title) {
        this.code = code;
        this.title = title;
    }

    @Override
    public String getName() { return name();}
    @Override
    public int getCode() {
        return code;
    }
    @Override
    public String getTitle() {
        return title;
    }
}
