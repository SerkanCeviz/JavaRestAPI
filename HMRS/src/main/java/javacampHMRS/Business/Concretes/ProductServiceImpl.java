package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.ProductService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.ProductRepository;
import javacampHMRS.Entity.Concretes.Product_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public DataResult<Product_> getById(int id) {
        return new SuccesDataResult(productRepository.getById(id));
    }

    @Override
    public DataResult<List<Product_>> getByName(String name) {
        return new SuccesDataResult(productRepository.getByProductName(name));
    }

    @Override
    public DataResult<List<Product_>> getAll() {
        return new SuccesDataResult(productRepository.findAll());
    }
}
