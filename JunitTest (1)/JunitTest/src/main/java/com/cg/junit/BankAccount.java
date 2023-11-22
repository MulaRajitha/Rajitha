package com.cg.junit;

public class BankAccount{
	private int amount=10000;
	public boolean withdraw(int amountToWithdraw) throws InsufficientFundsException {
		if(amountToWithdraw>amount)
		{
			throw new InsufficientFundsException();
		}
		amount-=amountToWithdraw;
		return true;
	}

public static void main() {
}
}