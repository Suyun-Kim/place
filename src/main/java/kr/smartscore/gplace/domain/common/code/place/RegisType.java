package kr.smartscore.gplace.domain.common.code.place;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

public enum RegisType implements EnumMapperType {
    GENERAL(0,"일반"),
    VERIFIED(1,"회원"),
    AFFILIATE(2,"제휴");

    private int code;
    private String title;

    RegisType(int code, String title) {
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
