package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.UsStatesService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.UsStates_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usstates")
@RequiredArgsConstructor
public class UsStatesController {
    private final UsStatesService usStatesService;

    @GetMapping(value = "/getAll")
    DataResult<UsStates_> getAll(){
        return usStatesService.getAll();
    }
}
