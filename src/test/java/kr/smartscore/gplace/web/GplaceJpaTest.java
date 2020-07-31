package kr.smartscore.gplace.web;
import kr.smartscore.gplace.domain.place.repository.PlaceRepository;
import kr.smartscore.gplace.domain.place.dto.PlaceInfoDto;
import kr.smartscore.gplace.domain.place.entity.Place;
import kr.smartscore.gplace.domain.user.entity.Admin;
import kr.smartscore.gplace.domain.user.entity.AdminRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GplaceJpaTest {
    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Test
    public void Place_QueryDsl_Test () {
        // given
        String regisType = "0";
        String placeType = "0";

        //when
        List<Place> places = placeRepository.findByDynamic(placeType,regisType);

        //then
        Boolean isData = places.size() > 0;
        assertThat(isData, is(true));
    }
    @Test
    public void place_QueryDsl_Join_Test () {
        // given
        String regisType = "0";
        String placeType = "0";

        List<PlaceInfoDto> places = placeRepository.findByJoinAll(placeType,regisType);
        Boolean isData = places.size() > 0;
        assertThat(isData, is(true));
    }
    @Test
    public void place_UrbanDBTable_조회 () {
        String id = "sunsee78";
        Admin admin = adminRepository.findById(id);
        assertThat(admin.getId(), is("sunsee78"));
    }
    @Test
    public void place_타디비조인_조회 () {
        List<PlaceInfoDto> places = placeRepository.findByPlaceAdmin();
        Boolean isData = places.size() > 0;
        assertThat(isData, is(true));
    }
}
