package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.TerritoryService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.TerritoryRepository;
import javacampHMRS.Entity.Concretes.Territory_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TerritoryServiceImpl implements TerritoryService {

    private final TerritoryRepository territoryRepository;
    @Override
    public DataResult<Territory_> getAll() {
        return new SuccesDataResult<>(territoryRepository.findAll());
    }
}
