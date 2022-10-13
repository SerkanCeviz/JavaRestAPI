package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.EmployeeService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Employee_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value = "/getAll")
    DataResult<Employee_> getAll(){
        return employeeService.getAll();
    }

    @PostMapping(value = "/addEmployee")
    Result addEmployee(@RequestBody Employee_ employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping(value = "/updateEmployee")
    Result updateEmployee(@RequestParam int employeeId, @RequestBody Employee_ employee){
        return employeeService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping(value = "/deleteEmployee")
    Result deleteEmployee(@RequestParam int employeeId){
        return employeeService.deleteEmployee(employeeId);
    }

}
