package kr.smartscore.gplace.domain.common.code.place;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

/**
 * 편의시설
 */
public enum Facilities implements EnumMapperType {
    SAUNA(0,"사우나"),
    SHOWER_ROOM(1,"샤워장");

    private int code;
    private String title;

    Facilities(int code, String title) {
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
