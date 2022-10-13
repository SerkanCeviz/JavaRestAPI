package javacampHMRS.Business.Concretes;

import javacampHMRS.Business.Abstract.RegionService;
import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Core.Concretes.Result.SuccesDataResult;
import javacampHMRS.DataAccess.Abstract.RegionRepository;
import javacampHMRS.Entity.Concretes.Region_;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {
    private final RegionRepository regionRepository;
    @Override
    public DataResult<Region_> getAll() {
        return new SuccesDataResult(regionRepository.findAll());
    }
}
