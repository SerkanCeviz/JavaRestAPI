package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Customer_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer_, Integer> {

    List<Customer_> findAll();
    Customer_ findByCustomerId(int customerId);
    Result deleteById(int id);
}
