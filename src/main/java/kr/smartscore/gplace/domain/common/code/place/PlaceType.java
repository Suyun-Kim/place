package kr.smartscore.gplace.domain.common.code.place;


import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperType;

/**
 * 연습장 구분 place
 */
public enum PlaceType implements EnumMapperType {
    OUTSIDE(0,"실외"),
    INSIDE(1,"실내"),
    PAR3(2,"PAR3"),
    STUDIO(3,"스튜디오");

    private int code;
    private String title;

    PlaceType(int code, String title) {
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
