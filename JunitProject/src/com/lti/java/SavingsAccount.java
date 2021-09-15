package com.lti.java;

public class SavingsAccount{
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Savingsaccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	public void withdraw(double amountToWithdraw) {
		this.accountBalance=this.accountBalance-amountToWithdraw;
		//this.accountBalance=this.accountBalance-10;
	}
	public void deposit(double amountToDeposit) {
		this.accountBalance=this.accountBalance+amountToDeposit;
		//this.accountBalance=this.accountBalance+10;
	}
}
