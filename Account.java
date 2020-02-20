package lab4;

public class Account {

	private String AccountName;
	private String AccountID;
	private int Balance;
	
      public Account() 
	
	{
		
	}
	
	public Account(String accountName, String accountID, int balance) 
	
	{
	
		AccountName = accountName;
		AccountID = accountID;
		Balance = balance;
	}
	
	
	public void Deposit (int Balance)
	{
		
		System.out.println(" You Have Deposited : " + Balance);
		
	}
	
	public void Withdraw (int Balance)
	{
		
		System.out.println(" You Have Withdrawed : " + Balance);
		
	}
	
	public void show()
	{
		
		System.out.println(" Account Name is : " + AccountName);
		System.out.println(" Account ID is : " + AccountID);
		System.out.println(" Balance  is : " + Balance);
		
	}
	
	public void CurrentBalance(int Balance, int Deposit, int Withdraw)
	
	{
		int Result = (Balance+Deposit)-Withdraw;
		System.out.println(" Current Balanc  is : " + Result);
		
	
	
	
	
	}	
}
