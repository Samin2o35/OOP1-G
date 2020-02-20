package lab4;

public class Account_Test {

	public static void main(String[] args) {
		
		
		Account A1 = new Account (" Samin", " twentyfour", 50);
		System.out.println(A1);
		A1.show();
		A1.Deposit(15000);
		A1.Withdraw(77000);
		System.out.println();
		
		A1.CurrentBalance(50,15000,77000);
		
		
		
		
		
		
	}

}
