package com.cdac.app;

import java.util.List;

import com.cdac.dao.CustomerAddressDao;
import com.cdac.entity.Address;
import com.cdac.entity.Customer;

public class AddCustomerAndAddress {
	
	public static void main(String[] args) {
		
		CustomerAddressDao dao = new CustomerAddressDao();
		
//		Customer c = new Customer();
//		c.setName("Ashutosh");
//		c.setEmail("ashutosh@gmail.com");
//		
//		dao.add(c);
//		
//		Address ad = new Address();
//		ad.setCity("Kolhapur");
//		ad.setPincode(416001);
//		ad.setState("MH");
//		
//		dao.add(ad);
		
		/*Customer c = dao.fetchCustomer(1);
		Address ad = dao.fetchAddress(1);
		
		c.setAddress(ad);
		dao.update(c);
		*/
		
		/*Customer c = new Customer();
		c.setName("Ashutosh");
		c.setEmail("ashutosh@gmail.com");
		
		Address ad = new Address();
		ad.setCity("Kolhapur");
		ad.setPincode(416001);
		ad.setState("MH");
		
		c.setAddress(ad);
		
		dao.add(c);*/
		
//		List<Customer> list = dao.fetchCustomerByEmail("gmail");
		/*List<Customer> list = dao.fetchCustomerByCity("Kolhapur");
		for(Customer c: list) {
			System.out.println(c.getId()+" "+c.getName()+" "+c.getEmail());
		}*/
		
		Address ad = dao.fetchAddressByCustomerName("Ashutosh");
		System.out.println(ad.getCity()+" "+ad.getPincode());
	}
}
