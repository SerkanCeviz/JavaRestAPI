package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.EmployeeTerritoriesService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.EmployeeTerritories_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employeeterritories")
@RequiredArgsConstructor
public class EmployeeTerritoriesController {
    private final EmployeeTerritoriesService employeeTerritoriesService;

    @GetMapping(value = "/getAll")
    DataResult<EmployeeTerritories_> getAll(){
        return employeeTerritoriesService.getAll();
    }

    @GetMapping(value = "/getAllByEmployeeId")
    DataResult<EmployeeTerritories_> getAllByEmployeeId(@RequestParam int employeeId){
        return employeeTerritoriesService.getAllByEmployeeId(employeeId);
    }

    @GetMapping(value = "/getAllByTerritoryId")
    DataResult<EmployeeTerritories_> getAllByTerritoryId(@RequestParam int territoryId){
        return employeeTerritoriesService.getAllByTerritoryId(territoryId);
    }
}
