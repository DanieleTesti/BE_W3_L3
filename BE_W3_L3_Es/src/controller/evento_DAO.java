package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Eventi;

public class evento_DAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BE_W3_L3_Es");
	static EntityManager em = emf.createEntityManager();

	public static void addEvent(Eventi e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Evento salvato nel database!!");
	}

	public static Eventi findById(Long id) {
		em.getTransaction().begin();
		Eventi e = em.find(Eventi.class, id);
		em.getTransaction().commit();
		System.out.println("Evento letto!!");
		return e;
	}

	public static void removeEvent(Eventi e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Evento eliminaro dal database!!");
	}

	public static void refresh(Eventi e) {
		em.getTransaction().begin();
		em.refresh(e);
		em.getTransaction().commit();
		System.out.println("Aggiornamento database!!");
	}

}
