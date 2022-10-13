package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Entity.Concretes.Territory_;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TerritoryRepository extends JpaRepository<Territory_, Integer> {

    List<Territory_> findAll();
}
