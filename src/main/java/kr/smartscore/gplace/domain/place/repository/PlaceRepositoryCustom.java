package kr.smartscore.gplace.domain.place.repository;

import kr.smartscore.gplace.domain.place.dto.PlaceInfoDto;
import kr.smartscore.gplace.domain.place.entity.Place;
import java.util.List;

public interface PlaceRepositoryCustom {
    List<Place> findByDynamic (String placeType, String regisType);
    List<PlaceInfoDto> findByJoinAll (String placeType, String regisType);
    List<PlaceInfoDto> findByPlaceAdmin ();
}
