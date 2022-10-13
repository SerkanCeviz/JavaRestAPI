package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Core.Concretes.Result.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacampHMRS.Entity.Concretes.Employee_;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee_, Integer> {

    List<Employee_> findAll();
    Employee_ findById(int id);
    Result deleteById(int employeeId);
}
