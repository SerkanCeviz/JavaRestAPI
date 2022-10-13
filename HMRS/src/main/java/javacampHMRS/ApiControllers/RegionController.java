package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.RegionService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Region_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/region")
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;

    @GetMapping(value = "/getAll")
    DataResult<Region_> getAll(){
        return regionService.getAll();
    }
}
