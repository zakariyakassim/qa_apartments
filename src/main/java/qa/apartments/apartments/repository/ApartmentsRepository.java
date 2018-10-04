package qa.apartments.apartments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import qa.apartments.apartments.entities.Apartment;

public interface ApartmentsRepository extends JpaRepository<Apartment, Long> {

}