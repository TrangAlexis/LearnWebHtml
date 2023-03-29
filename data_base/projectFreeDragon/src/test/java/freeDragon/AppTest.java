package freeDragon;

import freeDragon.armor.Armor;
import freeDragon.dao.ContextJpa;
import freeDragon.dao.DaoArmor;
import freeDragon.dao.DaoWeapon;
import freeDragon.miscallineous.DamageType;
import freeDragon.weapon.Dice_Throw;
import freeDragon.weapon.Weapon;


public class AppTest {
	public static void main(String[] args) {
		test_weapons();
		test_armor();
		
	}
	
	private static void test_weapons() {
		DaoWeapon daoWeapon = ContextJpa.getDaoWeapon();
		Weapon dagger = new Weapon(
				"Simple Melee Weapon","Dagger","Dague",
				new Dice_Throw(1,4),
				DamageType.slashing,
				1,true,false,true,false,
				null,
				false,
				null,
				"Thrown (20/60)",
				false,
				null);
		dagger=daoWeapon.save(dagger);
	}
	
	
	private static void test_armor() {
		DaoArmor daoArmor = ContextJpa.getDaoArmor();
		Armor armor = new Armor("Leather armor");
		armor=daoArmor.save(armor);
	}
}
