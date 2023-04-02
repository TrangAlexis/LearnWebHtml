package freeDragon;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import freeDragons.config.JpaConfig;
import freeDragons.entities.armors.Armor;
import freeDragons.entities.armors.Type_Armor;
import freeDragons.entities.miscallineous.Cost;
import freeDragons.services.ArmorsServices;

public class CreateDataBaseArmorsTest {
	public static void main(String[] args) {
		
		test_armor();
		
	}
	private static void test_armor() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
		ArmorsServices armrSrv = ctx.getBean(ArmorsServices.class);
		
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

		armrSrv.createOrUpdate(armor);
		System.out.println(armrSrv.findAll());
		System.out.println(armrSrv.findById(1L));
		armrSrv.deleteById(1L);
		
		ctx.close();
	}
}
