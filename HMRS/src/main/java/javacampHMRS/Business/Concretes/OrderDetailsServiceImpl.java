package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.OrderDetailsService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.OrderDetailsRepository;
import javacampHMRS.Entity.Concretes.OrderDetails_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OrderDetailsServiceImpl implements OrderDetailsService {

    private final OrderDetailsRepository orderDetailsRepository;
    @Override
    public DataResult<OrderDetails_> getAll() {
        return new SuccesDataResult(orderDetailsRepository.findAll());
    }
}
