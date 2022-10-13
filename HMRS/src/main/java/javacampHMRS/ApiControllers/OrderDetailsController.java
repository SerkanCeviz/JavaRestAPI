package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.OrderDetailsService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.OrderDetails_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orderDetails")
@RequiredArgsConstructor
public class OrderDetailsController {

    private final OrderDetailsService orderDetailsService;

    @GetMapping(value = "/getAll")
    DataResult<OrderDetails_> getAll(){
        return orderDetailsService.getAll();
    }
}
