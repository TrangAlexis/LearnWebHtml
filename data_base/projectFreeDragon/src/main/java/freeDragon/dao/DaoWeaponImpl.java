package freeDragon.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import freeDragon.weapon.Weapon;

public class DaoWeaponImpl implements DaoWeapon{

	@Override
	public Weapon save(Weapon obj) {
		EntityManager em = ContextJpa.getInstance().getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		obj = em.merge(obj);
		tx.commit();
		em.close();
		return obj;
	}

	@Override
	public void delete(Weapon obj) {
		EntityManager em = ContextJpa.getInstance().getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(em.merge(obj));
		tx.commit();
		em.close();
	}

	@Override
	public void deleteByKey(Long key) {
		EntityManager em = ContextJpa.getInstance().getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(em.find(Weapon.class, key));
		tx.commit();
		em.close();
	}

	@Override
	public Weapon findByKey(Long key) {
		Weapon weapon = null;
		EntityManager em = ContextJpa.getInstance().getEntityManagerFactory().createEntityManager();
		weapon = em.find(Weapon.class, key);
		em.close();
		return weapon;
	}

	@Override
	public List<Weapon> findAll() {
		EntityManager em = ContextJpa.getInstance().getEntityManagerFactory().createEntityManager();
		TypedQuery<Weapon> query = em.createQuery(
				"select distinct w from Weapons w", Weapon.class);
		List<Weapon> weapons = query.getResultList();
		em.close();
		return weapons;
	}

}
