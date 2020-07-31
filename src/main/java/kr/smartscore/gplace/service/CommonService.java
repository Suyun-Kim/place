package kr.smartscore.gplace.service;

import kr.smartscore.gplace.domain.common.repository.CommonPropertiesRepository;
import kr.smartscore.gplace.domain.common.entity.CommonProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommonService {
    // private final SampleMapper sampleMapper;
    private final CommonPropertiesRepository commonPropertiesRepository;
    public List<CommonProperties> getCommonPropertiesList(String target) {
        List<CommonProperties> value = commonPropertiesRepository.findByTargetOrderByIdxAsc(target);
        return value;
    }
    public CommonProperties getCommonProperties(String target, Integer properties_code) {
        CommonProperties value = commonPropertiesRepository.findByTargetAndPropertiesCode(target, properties_code);
        return value;
    }
}
