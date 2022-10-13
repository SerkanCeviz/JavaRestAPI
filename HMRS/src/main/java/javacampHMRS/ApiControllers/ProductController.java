package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.ProductService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Product_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping(value = "/getAll")
    public DataResult<List<Product_>> getAll(){
        return productService.getAll();
    }

    @GetMapping(value = "getByName")
    public DataResult<List<Product_>> getProductByName(@RequestParam String name){
        return productService.getByName(name);
    }

    @GetMapping(value = "")
    public DataResult<Product_> getById(@RequestParam int id){
        return productService.getById(id);
    }

}
