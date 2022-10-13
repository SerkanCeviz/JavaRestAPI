package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Supplier_;

public interface SupplierService {

    DataResult<Supplier_> getAll();
}
