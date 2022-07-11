package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class InsertEmployee {
	
	public static void main(String[] args) {
		/*Employee emp = new Employee();
		emp.setEmpno(1003);
		emp.setName("Dhiraj");
		emp.setSalary(20000);
		emp.setDateOfJoining(LocalDate.of(2020,7,25));
		
		EmployeeDao dao = new EmployeeDao();
		dao.add(emp);*/
		
		/*EmployeeDao dao = new EmployeeDao();
		Employee emp = dao.fetch(1002);
		System.out.println(emp.getEmpno()+ " "+emp.getName()+" "+emp.getSalary()+" "+emp.getDateOfJoining());
		*/
		
		EmployeeDao dao = new EmployeeDao();
		List<Employee> list = dao.fetchAll();
		for(Employee e : list) {
			System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary()+" "+e.getDateOfJoining());
		}
		
		System.out.println(".................");
		List<String> names = dao.fetchAllNames();
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("...............");
		List<Employee> sal = dao.fetchAllBySalary(10000);
		for(Employee e1 : sal) {
			System.out.println(e1.getName()+" "+e1.getSalary()+" "+e1.getDateOfJoining());
		}
	}

	/*public static void main(String[] args) {
		//During this step, the persistence.xml file will be read  
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Employee emp = new Employee();
		emp.setEmpno(1002);
		emp.setName("Chinmay");
		emp.setSalary(10000);
		emp.setDateOfJoining(LocalDate.of(2019, 8, 11));
		em.persist(emp);  // persist method will generate insert query
		
		tx.commit();
		
		emf.close();
	}*/
}
