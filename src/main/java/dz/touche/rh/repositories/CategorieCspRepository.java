package dz.touche.rh.repository;

import dz.touche.rh.domain.CategorieCsp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieCspRepository extends JpaRepository<CategorieCsp, Long>, JpaSpecificationExecutor<CategorieCsp> {
}
