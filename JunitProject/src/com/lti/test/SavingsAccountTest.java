package com.lti.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.java.*;
public class SavingsAccountTest {
	SavingsAccount savingsaccount=Bank.getObject();
@Test

public void testTruth() {
System.out.println("Testing started  : withdraw.....");
Assertions.assertTrue(14>5);
System.out.println("passed1");
Assertions.assertTrue(24>5);
System.out.println("passed2");
Assertions.assertTrue(34>5);
System.out.println("passed3");
SavingsAccount savObj = new SavingsAccount(100,"Julie",5000);
System.out.println("Testing finished : withdraw.....");

}
@Test
void testWithdraw() {
	System.out.println("Testing the withdraw() method");
	System.out.println("creating object..");
	
	Assertions.assertNotNull(savingsaccount);
	System.out.println("object created..");
	
	double balanceBeforeDeposit = savingsaccount.getAccountBalance();
	System.out.println("invoking method");
	double amountToBeWithdraw=3000;
	
	savingsaccount.withdraw(amountToBeWithdraw);
	
	Assertions.assertEquals(balanceBeforeDeposit-amountToBeWithdraw,savingsaccount.getAccountBalance());
	
	System.out.println("Method succeeded");
}
@BeforeEach
void setUp() {
	System.out.println("setup() beforeEach invoked..");
	savingsaccount=Bank.getObject();
	System.out.println("some coding..1");
	System.out.println("some coding..2");
	System.out.println("some coding..3");
	
}
@Test
void testDeposit() {
	System.out.println("Testing the deposit() method");
	System.out.println("creating object..");
	
	Assertions.assertNotNull(savingsaccount);
	System.out.println("object created..");
	
	double balanceBeforeDeposit = savingsaccount.getAccountBalance();
	System.out.println("invoking method");
	double amountToBeDeposit=3000;
	
	savingsaccount.withdraw(amountToBeDeposit);
	
	//Assertions.assertEquals(balanceBeforeDeposit+amountToBeDeposit,savingsaccount.getAccountBalance());
	
	System.out.println("Method succeeded");
}

}