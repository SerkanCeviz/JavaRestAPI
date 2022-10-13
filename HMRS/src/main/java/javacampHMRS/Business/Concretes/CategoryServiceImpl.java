package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.CategoryService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.CategoryRepository;
import javacampHMRS.Entity.Concretes.Category_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public DataResult<Category_> getAll() {
        return new SuccesDataResult(categoryRepository.findAll());
    }

    @Override
    public Result addCategory(Category_ category) {
        return new SuccesDataResult(categoryRepository.save(category));
    }

    @Override
    public Result updateCategory(int categoryId, Category_ category) {
        Category_ existCategory = categoryRepository.findByCategoryId(categoryId);
        existCategory.setCategoryName(category.getCategoryName());
        existCategory.setDescription(category.getDescription());
        return new SuccesDataResult(categoryRepository.save(existCategory));
    }

    @Override
    public Result deleteCategory(int categoryId) {
        return new SuccesDataResult(categoryRepository.deleteById(categoryId));
    }
}
