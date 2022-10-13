package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Territory_;

public interface TerritoryService {

    DataResult<Territory_> getAll();
}
