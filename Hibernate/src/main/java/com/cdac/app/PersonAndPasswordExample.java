package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.PersonAndPasswordDao;
import com.cdac.entity.Password;
import com.cdac.entity.Person;

public class PersonAndPasswordExample {
	
	public static void main(String[] args) {
		
		/*Person p = new Person();
		p.setName("Dishi");
		p.setEmail("dishi@gmail.com");
		p.setDateOfBirthday(LocalDate.of(1997, 8, 25));
		
		Password ps = new Password();
		ps.setIssueDate(LocalDate.of(2020,8,30));
		ps.setExpiryDate(LocalDate.of(2030, 8, 30));
		ps.setIssuedBy("Gov. of India");
		
		p.setPassword(ps);
		ps.setPerson(p);
		
		PersonAndPasswordDao dao = new PersonAndPasswordDao();
		
		dao.addPerson(p);
		*/
		PersonAndPasswordDao dao = new PersonAndPasswordDao();
		
		Person p = dao.fetchCustomer(3);
		System.out.println(p.getName()+" "+p.getEmail()+" "+p.getDateOfBirthday());
	}
}
