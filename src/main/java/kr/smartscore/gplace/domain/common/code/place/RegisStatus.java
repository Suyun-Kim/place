package kr.smartscore.gplace.domain.common.code.place;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

/**
 * 등록 별 승인상태
 */
public enum RegisStatus implements EnumMapperType {
    COMPANION(-10,"반려"),
    WAIT(0,"승인대기"),
    APPROVAL(10,"승인");

    private int code;
    private String title;

    RegisStatus(int code, String title) {
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
