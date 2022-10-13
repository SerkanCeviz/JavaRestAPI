package javacampHMRS.ApiControllers;

import javacampHMRS.Business.Abstract.CategoryService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.Result;
import javacampHMRS.Entity.Concretes.Category_;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping(value = "/getAll")
    DataResult<Category_> getAll(){
        return categoryService.getAll();
    }

    @PostMapping(value = "/addCategory")
    Result add(@RequestBody Category_ category){
        return categoryService.addCategory(category);
    }

    @PutMapping(value = "/updateCategory")
    Result update(@RequestParam int categoryId ,@RequestBody Category_ category){
        return categoryService.updateCategory(categoryId,category);
    }

    @DeleteMapping(value = "/deleteCategory")
    Result delete(@RequestParam int categoryId){
        return categoryService.deleteCategory(categoryId);
    }
}
