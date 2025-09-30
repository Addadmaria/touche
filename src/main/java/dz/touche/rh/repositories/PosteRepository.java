package dz.touche.rh.repositories;

import dz.touche.rh.entities.Poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteRepository extends JpaRepository<Poste, Long>, JpaSpecificationExecutor<Poste> {
}
