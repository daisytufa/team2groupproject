package repository;

import entity.Resource_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Resource_DetailsRepository extends JpaRepository<Resource_Details,Integer> {
}
