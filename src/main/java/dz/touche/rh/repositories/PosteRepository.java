package dz.touche.rh.repository;

import dz.touche.rh.domain.Poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteRepository extends JpaRepository<Poste, Long>, JpaSpecificationExecutor<Poste> {
}
