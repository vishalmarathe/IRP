package com.cg.test;

public class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String message)
	{
		super(message);
	}

}
