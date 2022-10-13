package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.SupplierService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.SupplierRepository;
import javacampHMRS.Entity.Concretes.Supplier_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {
    private final SupplierRepository supplierRepository;
    @Override
    public DataResult<Supplier_> getAll() {
        return new SuccesDataResult(supplierRepository.findAll());
    }
}
