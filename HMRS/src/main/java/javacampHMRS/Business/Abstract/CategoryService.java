package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Category_;

public interface CategoryService {

    DataResult<Category_> getAll();
    Result addCategory (Category_ category);
    Result updateCategory (int categoryId, Category_ category);
    Result deleteCategory (int categoryId);

}
