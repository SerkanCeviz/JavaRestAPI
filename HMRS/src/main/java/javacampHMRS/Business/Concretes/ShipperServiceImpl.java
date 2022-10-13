package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.ShipperService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.ShipperRepository;
import javacampHMRS.Entity.Concretes.Shipper_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShipperServiceImpl implements ShipperService {
    private final ShipperRepository shipperRepository;
    @Override
    public DataResult<Shipper_> getAll() {
        return new SuccesDataResult(shipperRepository.findAll());
    }
}
