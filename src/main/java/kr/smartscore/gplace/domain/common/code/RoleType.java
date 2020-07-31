package kr.smartscore.gplace.domain.common.code;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

public enum RoleType implements EnumMapperType {
    ADMIN("관리자"),
    TEST("테스트");

    private String title;

    RoleType(String title) {
        this.title = title;
    }

    @Override
    public String getName() { return name();}
    @Override
    public int getCode() {
        return 0;
    }
    @Override
    public String getTitle() {
        return title;
    }
}
