package com.cg.test;

public class ICICIBank extends Bank {
	

	void display() throws InvalidAccountNumberException, InsufficientBalanceException
	{
		try
		{
			System.out.println("Test");
			
			throw new InvalidAccountNumberException("InvalidAccountNumberException");
			
		}
		catch(Exception obj){
			throw new InsufficientBalanceException("insufficientbalance exception");
		}

	}	
}
