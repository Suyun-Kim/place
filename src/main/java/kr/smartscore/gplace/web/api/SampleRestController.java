package kr.smartscore.gplace.web.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kr.smartscore.gplace.infrastructure.dao.sample.vo.SampleVo;
import kr.smartscore.gplace.service.SampleService;
import kr.smartscore.gplace.web.dto.sample.SampleSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class SampleRestController {
    private final SampleService sampleService;

    @ApiOperation(value="권한 조회", response=Long.class, tags = "Sample>ADMIN/권한")
    @ApiResponses({
            @ApiResponse(code=200, message="정상 호출", response=Long.class),
            @ApiResponse(code=400, message="호출 인자 값이 잘못 되었거나 필수 인자가 포함 되지 않은 경우"),
    })
    @GetMapping("api/sample/{id}")
    public SampleVo findById(@PathVariable Long id) {
        return sampleService.findeById(id);
    }
    @ApiOperation(value="권한 추가", response=Long.class, tags = "Sample>ADMIN/권한")
    @PostMapping("api/sample")
    public Long reg(@RequestBody SampleSaveRequestDto requestDto) {
        return sampleService.reg(requestDto);
    }
    @ApiOperation(value="권한 삭제", response=Long.class, tags = "Sample>ADMIN/권한")
    @DeleteMapping("/api/sample/{id}")
    public Long delete(@PathVariable Long id) {
        sampleService.delete(id);
        return id;
    }
}
