package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.UsStatesService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.UsStatesRepository;
import javacampHMRS.Entity.Concretes.UsStates_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsStatesServiceImpl implements UsStatesService {
    private final UsStatesRepository usStatesRepository;
    @Override
    public DataResult<UsStates_> getAll() {
        return new SuccesDataResult(usStatesRepository.findAll());
    }
}
