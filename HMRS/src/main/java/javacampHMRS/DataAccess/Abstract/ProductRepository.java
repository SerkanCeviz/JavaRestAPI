package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Entity.Concretes.Product_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product_, Integer> {
    List<Product_> getByProductName(String productName);
    List<Product_> findAll();
    Product_ getByProductId(int productId);
}
