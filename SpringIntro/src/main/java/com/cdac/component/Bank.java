package com.cdac.component;

public interface Bank {
	
	public boolean isAccountPresent(int acno);
	public void withdraw(int atmid,int acno,double amount);
}
