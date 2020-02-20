package lab4;

public class Triangle {

	  private int X;
	   private int Y;
	   private int Z;
	   
	
	   
	   public Triangle() 
		{
			
			
		}
	
	public Triangle(int x, int y, int z) 
	{
		
		X = x;
		Y= y;
		Z= z;
	}
	
	


	public String toString() 
	{
		return "Triangle [X=" + X + ", Y=" + Y + ", Z=" + Z + "]";
	}
	
	public void Show_Info() 
	{
		System.out.println(" First Side of Triangle is : " +X);
		System.out.println(" Second Side of Triangle is : " +Y);
		System.out.println(" Third Side of Triangle is : " +Z);
		System.out.println("*********  Now Showing Which Triangle Is It  *********** ");
		
	}
	
	
	public void Which_Triangle_Is_It()
	{
		
		if ( X ==Y &&  Y== Z)
		{
			System.out.println("  This is an Equilateral Triangle ");
			
		}
		
		if ( X ==Y &&  Y!= Z)
		{
			System.out.println("  This Is an Isosceles Triangle ");
			
		}
		
		if ( X !=Y &&  Y== Z)
		{
			System.out.println("  This is an Isosceles Triangle ");
			
		}
		
		if ( X !=Y &&  X== Z)
		{
			System.out.println("  This Is an Isosceles Triangle ");
			
		}
		
		if ( X!=Y &&  Y!= Z && X!=Z)
		{
			System.out.println("  This is an Scalene Triangle ");
			
		}
		
		
	}
	
	

  
  
  
}
