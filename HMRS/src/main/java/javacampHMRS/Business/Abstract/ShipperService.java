package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Shipper_;

public interface ShipperService {

    DataResult<Shipper_> getAll();
}
