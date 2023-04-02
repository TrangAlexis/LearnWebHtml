package freeDragon.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ContextJpa {
	private static ContextJpa singleton;
	private EntityManagerFactory emf;

	private static DaoWeapon daoWeapon = new DaoWeaponImpl();
	private static DaoArmor daoArmor =new DaoArmorImpl();


	public static DaoWeapon getDaoWeapon() {
		return daoWeapon;
	}
	
	public static DaoArmor getDaoArmor() {
		return daoArmor;
	}
	
	private ContextJpa() {
		emf = Persistence.createEntityManagerFactory("dnd_db");
	}

	public static ContextJpa getInstance() {
		if (singleton == null) {
			singleton = new ContextJpa();
		}
		return singleton;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}

	public static void destroy() {
		if (singleton != null) {
			singleton.getEntityManagerFactory().close();
			singleton = null;
		}
	}
}
