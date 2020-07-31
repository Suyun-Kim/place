package kr.smartscore.gplace.domain.place.entity;

import lombok.*;

import javax.persistence.*;

/*
 * 연습장별 노출 광고 지역 등록
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "place_advertising_area")
public class PlaceAdvertisingArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "place_advertising_idx", nullable = false)
    private Long placeAadvertisingIdx;

    @Column(nullable = false)
    private String sido;

    @Column
    private String gugun;

}
