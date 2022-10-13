package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Entity.Concretes.Supplier_;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier_, Integer> {

    List<Supplier_> findAll();
}
