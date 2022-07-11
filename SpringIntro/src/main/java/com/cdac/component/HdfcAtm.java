package com.cdac.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HdfcAtm implements Atm{

	@Autowired
	private List<Bank> banks;
	
	public void withdraw(int acno, double amount) {
		System.out.println("Customer at HdfcAtm wants to withdraw money...");
		Bank CurrentBank = null;
		for(Bank bank : banks) {
			if(bank.isAccountPresent(acno)) {
				CurrentBank = bank;
				break;
			}
		}
		CurrentBank.withdraw(1234, acno, amount);
	}

}
