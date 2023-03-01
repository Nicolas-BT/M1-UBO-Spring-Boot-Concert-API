package fr.repositories;

import fr.entities.SalleConcert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleConcertRepository extends JpaRepository<SalleConcert,Integer> {
}
