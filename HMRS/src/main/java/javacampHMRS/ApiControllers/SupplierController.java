package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.SupplierService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Supplier_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/supplier")
@RequiredArgsConstructor
public class SupplierController {
    private final SupplierService supplierService;

    @GetMapping(value = "/getAll")
    DataResult<Supplier_> getAll(){
        return supplierService.getAll();
    }
}
