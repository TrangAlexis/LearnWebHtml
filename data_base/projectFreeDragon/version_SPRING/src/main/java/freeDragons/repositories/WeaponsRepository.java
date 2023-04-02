package freeDragons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import freeDragons.entities.weapons.Weapon;

public interface WeaponsRepository extends JpaRepository<Weapon, Long>{

}
