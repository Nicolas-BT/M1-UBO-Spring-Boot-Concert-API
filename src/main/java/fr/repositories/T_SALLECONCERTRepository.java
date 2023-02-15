package fr.repositories;

import fr.entities.T_SALLECONCERT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface T_SALLECONCERTRepository extends JpaRepository<T_SALLECONCERT,Integer> {
}
