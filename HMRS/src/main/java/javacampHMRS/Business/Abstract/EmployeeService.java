package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Employee_;

public interface EmployeeService {
    DataResult<Employee_> getAll();
    Result addEmployee(Employee_ employee);
    Result updateEmployee(int employeeId, Employee_ employee);
    Result deleteEmployee(int employeeId);

}
