package javacampHMRS.Business.Abstract;

import javacampHMRS.Core.Concretes.Result.DataResult;
import javacampHMRS.Entity.Concretes.UsStates_;

public interface UsStatesService {

    DataResult<UsStates_> getAll();
}
