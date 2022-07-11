package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Customer;
import com.cdac.entity.Password;
import com.cdac.entity.Person;

public class PersonAndPasswordDao {
	
	public void addPerson(Person p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(p);
		
		tx.commit();
		emf.close();		
	}
	
	/*public void addPassword(Password p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(p);
		
		tx.commit();
		emf.close();		
	}*/
	
	public Person fetchCustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p from Person p join p.password ps where ps.id = :pno");
		q.setParameter("pno",id);
		Person p = (Person) q.getSingleResult();
		emf.close();
		return p;	
	}
	
}
