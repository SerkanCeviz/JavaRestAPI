package javacampHMRS.Business.Concretes;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.ErrorDataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.EmployeeRepository;
import javacampHMRS.Entity.Concretes.Employee_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javacampHMRS.Business.Abstract.EmployeeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public DataResult<Employee_> getAll() {
        try {
            return new SuccesDataResult(employeeRepository.findAll());
        }
        catch (Exception e){
            return new ErrorDataResult("İşlem Başarısız");
        }
    }

    @Override
    public Result addEmployee(Employee_ employee) {
        return new SuccesDataResult(employeeRepository.save(employee));
    }

    @Override
    public Result updateEmployee(int employeeId, Employee_ employee) {
        Employee_ existEmployee = employeeRepository.findById(employeeId);
        existEmployee.setAddress(employee.getAddress());
        existEmployee.setCity(employee.getCity());
        existEmployee.setCountry(employee.getCountry());
        existEmployee.setBirthDate(employee.getBirthDate());
        existEmployee.setExtension(employee.getExtension());
        existEmployee.setHireDate(employee.getHireDate());
        existEmployee.setHomePhone(employee.getHomePhone());
        existEmployee.setName(employee.getName());
        existEmployee.setSurname(employee.getSurname());
        existEmployee.setRegion(employee.getRegion());
        existEmployee.setPostalCode(employee.getPostalCode());
        existEmployee.setTitle(existEmployee.getTitle());
        existEmployee.setTitleofCourtesy(employee.getTitleofCourtesy());
        return new SuccesDataResult(employeeRepository.save(existEmployee));
    }

    @Override
    public Result deleteEmployee(int employeeId) {
        return new SuccesDataResult(employeeRepository.deleteById(employeeId));
    }

}
