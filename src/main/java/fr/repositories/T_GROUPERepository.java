package fr.repositories;

import fr.entities.T_GROUPE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface T_GROUPERepository extends JpaRepository<T_GROUPE,Integer> {
}
