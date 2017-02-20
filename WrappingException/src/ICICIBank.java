class Bank 
{
	void display() throws InvalidAccountNumberException
	{
		
	}
}
public class ICICIBank extends Bank {
	
	void display() throws InvalidAccountNumberException
	{
		try
		{
		throw new InsufficientBalanceException("insufficientbalance exception");
		}
		catch(Exception obj)
		{
			throw new InvalidAccountNumberException(obj.getMessage());
		}
	
	}
}
