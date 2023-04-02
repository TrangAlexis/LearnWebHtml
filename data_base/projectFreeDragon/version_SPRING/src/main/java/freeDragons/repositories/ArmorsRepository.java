package freeDragons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import freeDragons.entities.armors.Armor;

public interface ArmorsRepository extends JpaRepository<Armor, Long>{

}
