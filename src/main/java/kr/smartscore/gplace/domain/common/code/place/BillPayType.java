package kr.smartscore.gplace.domain.common.code.place;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

/**
 * 지급방식
 */
public enum BillPayType implements EnumMapperType {
    FEES(0,"선지급"),
    DEPOSIT(1,"후지급");

    private int code;
    private String title;

    BillPayType(int code, String title) {
        this.code = code;
        this.title = title;
    }

    @Override
    public String getName() { return name();}
    @Override
    public int getCode() { return code; }
    @Override
    public String getTitle() {
        return title;
    }
}
