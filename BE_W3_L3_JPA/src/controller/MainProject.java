package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.User;
public class MainProject {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BE_W3_L3_JPA");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {


		User u = new User();
		u.setName("Mario");
		u.setLastname("Rossi");
		u.setEmail("m.rossi@example.com");
		/// addUser(u);

		try {
		// LETTURA UTENTE
		User utenteLetto = findUser(1l);
		System.out.println(utenteLetto);
		// UPDATE
		utenteLetto.setEmail("test@example.com");
		updateUser(utenteLetto);
		// REMOVE
		removeUser(utenteLetto);
		List<User> lista = findAllUser();
		lista.forEach(ut -> System.out.println(ut));

	} catch (Exception e) {
	} finally {
		em.close();
		emf.close();
	}
	}

	public static void addUser(User u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente salvato nel database!!");
	}

	public static User findUser(Long id) {
		em.getTransaction().begin();
		User u = em.find(User.class, id);
		em.getTransaction().commit();
		System.out.println("Utente letto!!");
		return u;
	}

	public static void updateUser(User u) {
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("Utente modificato nel database!!");
	}

	public static void removeUser(User u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("Utente eliminaro dal database!!");
	}

	public static List<User> findAllUser() {
		Query q = em.createNamedQuery("User.findAll");
		return q.getResultList();
	}

}
