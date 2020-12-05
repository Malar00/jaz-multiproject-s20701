package pl.edu.pjwstk.jazapi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pjwstk.jazapi.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
