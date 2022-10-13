package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.CustomerService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Customer_;
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
@RequestMapping(value = "/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(value = "/getAll")
    DataResult<Customer_> getAllCustomer(){
        return customerService.getAll();
    }

    @PostMapping(value = "/addCustomer")
    Result addCustomer(@RequestBody Customer_ customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping(value = "/updateCustomer")
    Result updateCustomer(@RequestParam int customerId, @RequestBody Customer_ customer){
        return customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping(value = "/deleteCustomer")
    Result deleteCustomer(@RequestParam int customerId){
        return customerService.deleteCustomer(customerId);
    }
}
