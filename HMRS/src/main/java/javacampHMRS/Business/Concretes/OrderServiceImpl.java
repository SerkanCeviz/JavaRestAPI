package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.OrderService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.OrderRepository;
import javacampHMRS.Entity.Concretes.Order_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;


    @Override
    public SuccesDataResult<Order_> getById(int id) {
        return new SuccesDataResult<>(orderRepository.getByOrderId(id));
    }

    @Override
    public DataResult<Order_> getAll() {
        return new SuccesDataResult(orderRepository.findAll());
    }


    @Override
    public DataResult<List<Order_>> getOrdersByCustomerId(int customerId) {
        return new SuccesDataResult(orderRepository.getByCustomerId(customerId));
    }

    @Override
    public DataResult<List<Order_>> getOrdersByEmployeeId(int employeeId) {
        return new SuccesDataResult(orderRepository.getByEmployeeId(employeeId));
    }

    @Override
    public Result addOrder(Order_ order) {
        return new SuccesDataResult(orderRepository.save(order));
    }

    @Override
    public Result updateOrder(Order_ order, int orderId) {
        Order_ existOrder = orderRepository.getByOrderId(orderId);
        existOrder.setShipAddress(order.getShipAddress());
        existOrder.setShipName(order.getShipName());
        existOrder.setShipCity(order.getShipCity());
        existOrder.setShipRegion(order.getShipRegion());
        existOrder.setShipCountry(order.getShipCountry());
        return new SuccesDataResult(orderRepository.save(existOrder));
    }
}
