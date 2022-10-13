package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.EmployeeTerritoriesService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.EmployeeTerritoriesRepository;
import javacampHMRS.Entity.Concretes.EmployeeTerritories_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeTerritoriesServiceImpl implements EmployeeTerritoriesService {

    private final EmployeeTerritoriesRepository employeeTerritoriesRepository;
    @Override
    public DataResult<EmployeeTerritories_> getAll() {
        return new SuccesDataResult(employeeTerritoriesRepository.findAll());
    }

    @Override
    public DataResult<EmployeeTerritories_> getAllByEmployeeId(int employeeId) {
        return new SuccesDataResult(employeeTerritoriesRepository.getAllByEmployeeId(employeeId));
    }

    @Override
    public DataResult<EmployeeTerritories_> getAllByTerritoryId(int territoryId) {
        return new SuccesDataResult(employeeTerritoriesRepository.getAllByTerritoryId(territoryId));
    }
}
