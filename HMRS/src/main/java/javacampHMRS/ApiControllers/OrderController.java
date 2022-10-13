package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.OrderService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Order_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping(value = "/getAll")
    DataResult<Order_> getAll(){
        return orderService.getAll();
    }

    @PostMapping (value = "/addOrder")
    Result addOrder(@RequestBody Order_ order){
        return orderService.addOrder(order);
    }

    @PutMapping (value = "/updateOrder")
    Result updateOrder(@RequestBody Order_ order, int orderId){
        return orderService.updateOrder(order, orderId);
    }
}
