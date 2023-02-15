package fr.repositories;


import fr.entities.T_CONCERT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface T_CONCERTRepository extends JpaRepository<T_CONCERT,Integer> {
}
