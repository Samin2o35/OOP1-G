package lab3;

public class Product_test {

	public static void main(String[] args) {

		Product P1= new Product(" JHANAKA", " User friendly", 1500.00);
		
		System.out.println(" -----------------------------  ");
		
		Product P2= new Product(" FALTU", "  EGULA MANUSH KINE", 400.00);
		
		Product P3= new Product();
		P3.Code = " WAH ";
		P3.Description = "  Excllent  ";  // By using defaut constructor that's why i have to set this
		P3.Price = 20.00;
		
		System.out.println(P1);
		System.out.println(" -----------------------------  ");
		System.out.println(P2);
		System.out.println(" -----------------------------  ");
		System.out.println(P3);
		
		
		
		

	

	}

}
