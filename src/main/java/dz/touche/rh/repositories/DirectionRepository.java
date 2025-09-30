package dz.touche.rh.repository;

import dz.touche.rh.domain.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionRepository extends JpaRepository<Direction, Long>, JpaSpecificationExecutor<Direction> {
}
