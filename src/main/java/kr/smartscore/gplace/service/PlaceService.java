package kr.smartscore.gplace.service;


import kr.smartscore.gplace.domain.place.repository.PlaceRepository;
import kr.smartscore.gplace.domain.place.entity.Place;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
public class PlaceService {

    @Qualifier("gplaceSqlSession")
    private final PlaceRepository placeRepository;

    public Optional<Place> findById(Long idx) {
        return placeRepository.findById(idx);

    }
}
