package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Region_;

public interface RegionService {
    DataResult<Region_> getAll();
}
