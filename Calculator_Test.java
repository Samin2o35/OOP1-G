
public class Calculator_Test {

	public static void main(String[] args) {
		Calculator calculation = new Calculator ();
		
		int result = calculation.add(15, 20);
		System.out.println("addition is : " +result);
		
		int result2 = calculation.sub(15, 20);
		 System.out.println("subtraction is : " +result2);
		 
		 Tax t =new Tax();
		 
		 Double totaltax = t.taxcal (50000.00);
		  System.out.println("Tax is :" +totaltax);
		

	}

}
