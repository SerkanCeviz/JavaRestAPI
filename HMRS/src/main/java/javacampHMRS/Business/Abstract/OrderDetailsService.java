package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.OrderDetails_;

public interface OrderDetailsService {

    DataResult<OrderDetails_> getAll();
}
