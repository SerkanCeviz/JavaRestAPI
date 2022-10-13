package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.Entity.Concretes.Order_;

import java.util.List;

public interface OrderService {
    SuccesDataResult<Order_> getById(int id);
    DataResult<Order_> getAll();
    DataResult<List<Order_>> getOrdersByCustomerId(int CustomerId);
    DataResult<List<Order_>> getOrdersByEmployeeId(int EmployeeId);

    Result addOrder(Order_ order);

    Result updateOrder(Order_ order, int orderId);

}
