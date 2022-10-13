package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Entity.Concretes.OrderDetails_;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails_, Integer> {

    List<OrderDetails_> findAll();
}
