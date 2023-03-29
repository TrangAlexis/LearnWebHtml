package freeDragon.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import freeDragon.armor.Armor;

public class DaoArmorImpl implements DaoArmor{

	@Override
	public Armor save(Armor obj) {
		EntityManager em = ContextJpa.getInstance().getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		obj = em.merge(obj);
		tx.commit();
		em.close();
		return obj;
	}

	@Override
	public void delete(Armor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByKey(Long key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Armor findByKey(Long key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Armor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
