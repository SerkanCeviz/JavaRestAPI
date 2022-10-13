package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.TerritoryService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Territory_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/territory")
public class TerritoryController {

    private final TerritoryService territoryService;

    @GetMapping
    DataResult<Territory_> getTerritories(){
       return territoryService.getAll();
    }
}
