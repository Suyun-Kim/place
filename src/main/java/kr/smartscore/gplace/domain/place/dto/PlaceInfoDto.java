package kr.smartscore.gplace.domain.place.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlaceInfoDto {
    private String placeName;
    private String placeTypeName;
    private String userPhone;
}
