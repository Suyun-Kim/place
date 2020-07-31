package kr.smartscore.gplace.web.api;


import kr.smartscore.gplace.domain.place.entity.Place;
import kr.smartscore.gplace.service.PlaceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/place")
@RequiredArgsConstructor
@Log4j2
public class PlaceRestController {

    private final PlaceService placeService;

    @GetMapping("/{idx}")
    public Place findById(@PathVariable Long idx) {
        log.info("PlaceRestController:findById ==> " + idx);
        Optional<Place> place = placeService.findById(idx);

        log.info("TEST ::: " + place.toString());

        return null;
    }
}
