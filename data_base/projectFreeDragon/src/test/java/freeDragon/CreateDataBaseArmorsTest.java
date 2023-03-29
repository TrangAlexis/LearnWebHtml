package freeDragon;

import freeDragon.armors.Armor;
import freeDragon.armors.Type_Armor;
import freeDragon.dao.ContextJpa;
import freeDragon.dao.DaoArmor;
import freeDragon.miscallineous.Cost;

public class CreateDataBaseArmorsTest {
	public static void main(String[] args) {
		test_armor();
	}
	private static void test_armor() {
		DaoArmor daoArmor = ContextJpa.getDaoArmor();
		Armor armor = new Armor(
				Type_Armor.light,
				"Padded armor",
				"Armure matelassée",
				new Cost(0,0,0,5,0),
				11,
				true,
				null,
				null,
				true,
				8);
		armor=daoArmor.save(armor);
	}
}
