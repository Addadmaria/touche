package dz.touche.rh.repositories;

import dz.touche.rh.entities.RaisonSortie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RaisonSortieRepository extends JpaRepository<RaisonSortie, Long>, JpaSpecificationExecutor<RaisonSortie> {
}
