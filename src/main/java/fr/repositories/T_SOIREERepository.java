package fr.repositories;

import fr.entities.T_SOIREE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface T_SOIREERepository  extends JpaRepository<T_SOIREE,Integer> {
}
