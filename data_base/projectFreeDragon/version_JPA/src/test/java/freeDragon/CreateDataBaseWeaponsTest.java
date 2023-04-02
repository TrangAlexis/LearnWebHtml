package freeDragon;

import freeDragon.dao.ContextJpa;
import freeDragon.dao.DaoWeapon;
import freeDragon.miscallineous.Cost;
import freeDragon.miscallineous.Damage_Type;
import freeDragon.miscallineous.Dice_Throw;
import freeDragon.weapons.Range_Weapon_Thrown;
import freeDragon.weapons.Weapon;


public class CreateDataBaseWeaponsTest {
	public static void main(String[] args) {
		test_weapons();
		
	}
	
	private static void test_weapons() {
		DaoWeapon daoWeapon = ContextJpa.getDaoWeapon();
		Weapon dagger = new Weapon(
				"Simple",
				" Melee",
				"Dagger",
				"Dague",
				new Cost(0,0,0,2,0),
				new Dice_Throw(1,4),
				Damage_Type.slashing,
				false,
				false,
				1,
				true,
				false,
				true,
				false,
				false,
				null,
				new Range_Weapon_Thrown(20,60),
				false,
				null);
		dagger=daoWeapon.save(dagger);
		
		Weapon club = new Weapon();
	}
	

}
