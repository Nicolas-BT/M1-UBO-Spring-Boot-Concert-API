package fr.repositories;

import fr.entities.Soiree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoireeRepository extends JpaRepository<Soiree,Integer> {
}
