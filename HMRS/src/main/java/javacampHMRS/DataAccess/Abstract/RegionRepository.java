package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Entity.Concretes.Region_;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region_,Integer> {

    List<Region_> findAll();
}
