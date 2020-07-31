package kr.smartscore.gplace.domain.common.code.enumMapper;

public class EnumMapperValue {
    private int code;
    private String title;
    private String name;

    public EnumMapperValue(EnumMapperType enumMapperType) {
        code = enumMapperType.getCode();
        title = enumMapperType.getTitle();
        name = enumMapperType.getName();
    }

    public int getCode() {return code;}
    public String getTitle() {return title;}
    public String getName() {return name;}

    @Override
    public String toString() {
        return String.format("{name=%s, code=%d, title=%s}", name, code, title);
    }
}
