public class ICICIBank extends Bank {
	
	void display() throws InvalidAccountNumberException
	{
		try
		{
			System.out.println("Test");
			
		}
		catch(Exception obj)
		{
			throw new InsufficientBalanceException("insufficientbalance exception");
		} 
	 
	}
}  
