package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Entity.Concretes.EmployeeTerritories_;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeTerritoriesRepository extends JpaRepository<EmployeeTerritories_, Integer> {

    List<EmployeeTerritories_> findAll();
    List<EmployeeTerritories_> getAllByEmployeeId(int employeeId);
    List<EmployeeTerritories_> getAllByTerritoryId(int territoryId);

}
