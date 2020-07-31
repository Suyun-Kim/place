package kr.smartscore.gplace.domain.common.code.place;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

/**
 * 노출상태관리
 */
public enum ShowStatus implements EnumMapperType {
    DELETE(-1,"삭제"),
    SHOW_OFF(0,"미노출"),
    SHOW_ON(1,"노출");

    private int code;
    private String title;

    ShowStatus(int code, String title) {
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
