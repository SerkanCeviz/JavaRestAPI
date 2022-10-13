package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.Product_;

import java.util.List;

public interface ProductService {
    DataResult<Product_> getById(int id);
    DataResult<List<Product_>> getByName(String name);
    DataResult<List<Product_>> getAll();

}
