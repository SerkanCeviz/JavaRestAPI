package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.ShipperService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Shipper_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shipper")
@RequiredArgsConstructor
public class ShipperController {

    private final ShipperService shipperService;

    @GetMapping(value = "/getAll")
    DataResult<Shipper_> getAll(){
        return shipperService.getAll();
    }
}
