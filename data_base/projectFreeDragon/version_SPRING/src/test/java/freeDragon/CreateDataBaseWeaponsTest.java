package freeDragon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import freeDragons.config.JpaConfig;
import freeDragons.entities.miscallineous.Cost;
import freeDragons.entities.miscallineous.Damage_Type;
import freeDragons.entities.miscallineous.Dice_Throw;
import freeDragons.entities.weapons.Range_Weapon_Thrown;
import freeDragons.entities.weapons.Weapon;
import freeDragons.services.WeaponsServices;

public class CreateDataBaseWeaponsTest {
	public static void main(String[] args) {
		test_weapons();
	}
	
	private static void test_weapons() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
		WeaponsServices wpnSrv = ctx.getBean(WeaponsServices.class);
		
		
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
		wpnSrv.createOrUpdate(dagger);
		System.out.println(wpnSrv.findAll());
		System.out.println(wpnSrv.findById(1L));
		wpnSrv.deleteById(1L);
		
		ctx.close();
		
	}
	

}
