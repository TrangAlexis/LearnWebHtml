package freeDragons.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import freeDragons.entities.armors.Armor;
import freeDragons.exceptions.ArmorsException;
import freeDragons.repositories.ArmorsRepository;

@Service
public class ArmorsServices {
	
	@Autowired
	private ArmorsRepository armorsRepository;
	
	public void createOrUpdate(Armor armor) {
		if (armor.getName_armor() == null || armor.getName_armor().isBlank()) {
			throw new ArmorsException("Armor missing a name");
		}
		armorsRepository.save(armor);
	}
	
	public Armor findById(Long id) {
		return armorsRepository.findById(id).orElseThrow(() -> {
			throw new ArmorsException("Missing ID in armors database: "+id);
		});
	}
	
	
	public void deleteById(Long id) {
		Armor checkArmor = this.findById(id);
		armorsRepository.deleteById(id);
	}
		
	
	public void delete(Armor armor) {
		this.deleteById(armor.getId());
	}
	

	public List<Armor> findAll(){
		List<Armor> lArmors = armorsRepository.findAll();
		if (lArmors.isEmpty()) {
			throw new ArmorsException("Empty armor data base");
		}
		return lArmors;
	}
	

	
}
