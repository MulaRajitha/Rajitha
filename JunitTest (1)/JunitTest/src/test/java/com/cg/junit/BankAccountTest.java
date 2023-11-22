package com.cg.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
	BankAccount ba=new BankAccount();
	
	@Test
	public void test() throws InsufficientFundsException {
		assertEquals(true,ba.withdraw(9000));
		assertEquals(true,ba.withdraw(100));
		assertEquals(true,ba.withdraw(100000));
		assertEquals(true,ba.withdraw(0));
	}
	
}
