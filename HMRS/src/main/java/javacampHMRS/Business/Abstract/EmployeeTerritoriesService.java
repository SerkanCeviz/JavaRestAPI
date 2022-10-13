package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.EmployeeTerritories_;

public interface EmployeeTerritoriesService {

    DataResult<EmployeeTerritories_> getAll();
    DataResult<EmployeeTerritories_> getAllByEmployeeId(int employeeId);
    DataResult<EmployeeTerritories_> getAllByTerritoryId(int territoryId);
}
