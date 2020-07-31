package kr.smartscore.gplace.domain.common.code.place;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

/**
 * 제휴신청현황
 */
public enum RegisItems implements EnumMapperType {
    NA(0,"N/A"),
    TICKET(1,"이용권"),
    ADVERTISING(2,"광고"),
    BOTH(12,"이용권+광고");

    private int code;
    private String title;

    RegisItems(int code, String title) {
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
