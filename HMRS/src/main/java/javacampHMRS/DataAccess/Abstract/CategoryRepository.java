package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Category_;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category_, Integer> {

    List<Category_> findAll();
    Result deleteById(int categoryId);

    Category_ findByCategoryId(int categoryId);

}
