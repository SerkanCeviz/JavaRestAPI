package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Order_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order_, Integer> {
       Order_ getByOrderId(int orderId);
       List<Order_> findAll();

       List<Order_> getByCustomerId(int customerId);

       List<Order_> getByEmployeeId(int employeeId);
}
