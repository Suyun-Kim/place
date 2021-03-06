package kr.smartscore.gplace.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.smartscore.gplace.domain.common.code.RoleType;
import kr.smartscore.gplace.web.dto.sample.SampleSaveRequestDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//@WebMvcTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleApiControllerTest {

    @LocalServerPort
    private int port;
    private MockMvc mvc;
    @Autowired
    private WebApplicationContext context;

    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                // .apply(springSecurity())
                .build();
    }

    @Test
    public void sample_마이바티스_조회() throws Exception {
         String url = "http://localhost:" + port + "/api/sample/1";
        //String url = "http://localhost:" + port + "/api/common-properties/SNS";
        //when
        mvc.perform(get(url))
                .andExpect(status().isOk());
                //.andExpect(jsonPath("$.id").value(1));
    }

    @Test
    public void sample_JPA_등록() throws Exception {
        //given
        SampleSaveRequestDto requestDto = SampleSaveRequestDto.builder()
                .email("developerkorea@gmail.com")
                .name("SYKKIM")
                .role(RoleType.ADMIN)
                .picture("NONE")
                .build();

        String url = "http://localhost:" + port + "/api/sample";
        //when
        mvc.perform(post(url)
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(requestDto)))
                .andExpect(status().isOk());
    }
    /*
    @Test
    public void sample_JPA_삭제() throws Exception {
        String url = "http://localhost:" + port + "/api/sample/3";
        //when
        mvc.perform(delete(url))
                .andExpect(status().isOk());
    }
     */

}
