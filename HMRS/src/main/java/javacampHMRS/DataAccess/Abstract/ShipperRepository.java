package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Entity.Concretes.Shipper_;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipperRepository extends JpaRepository<Shipper_, Integer> {

    List<Shipper_> findAll();
}
