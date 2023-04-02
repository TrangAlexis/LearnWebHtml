package freeDragons.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import freeDragons.entities.weapons.Weapon;
import freeDragons.exceptions.WeaponsException;
import freeDragons.repositories.WeaponsRepository;

@Service
public class WeaponsServices {
	
	@Autowired
	private WeaponsRepository weaponsRepository;
	
	public void createOrUpdate(Weapon weapon) {
		if (weapon.getName_weapon() == null || weapon.getName_weapon().isBlank()) {
			throw new WeaponsException("Weapon missing a name");
		}
		weaponsRepository.save(weapon);
	}
	
	public Weapon findById(Long id) {
		return weaponsRepository.findById(id).orElseThrow(() -> {
			throw new WeaponsException("Missing ID in weapons database: "+id);
		});
	}
	
	
	public void deleteById(Long id) {
		Weapon checkWeapon = this.findById(id);
		weaponsRepository.deleteById(id);
	}
		
	
	public void delete(Weapon weapon) {
		this.deleteById(weapon.getId());
	}
	

	public List<Weapon> findAll(){
		List<Weapon> lWeapons = weaponsRepository.findAll();
		if (lWeapons.isEmpty()) {
			throw new WeaponsException("Empty weapon data base");
		}
		return lWeapons;
	}
	

	
}
