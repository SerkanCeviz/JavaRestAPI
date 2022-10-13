package javacampHMRS.DataAccess.Abstract;

import javacampHMRS.Entity.Concretes.UsStates_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsStatesRepository extends JpaRepository<UsStates_, Integer> {
    List<UsStates_> getByStateName(String stateName);
}
