package kr.smartscore.gplace.domain.common.code.enumMapper;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EnumMapper {
    private Map<String, List<EnumMapperValue>> factory = new HashMap<>();

    public EnumMapper() {}

    private List<EnumMapperValue> toEnumMapperValues(Class<? extends EnumMapperType> e){

        return Arrays
                .stream(e.getEnumConstants())
                .map(EnumMapperValue::new)
                .collect(Collectors.toList());
    }

    public void put(String key, Class<? extends EnumMapperType> e){
        factory.put(key, toEnumMapperValues(e));
    }

    public List<EnumMapperValue> get(String key) {
        return factory.get(key);
    }
    public Map<String, List<EnumMapperValue>> get(List<String> keys){
        if (keys == null || keys.size() == 0)
            return new LinkedHashMap<>();

        return keys.stream()
                .collect(Collectors.toMap(Function.identity(), key -> factory.get(key)));
    }
    public Map<String, List<EnumMapperValue>> getAll(){
        return factory;
    }
}
