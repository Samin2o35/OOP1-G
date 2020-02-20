package lab3;

public class Product {
	String Code;
    String Description;
    Double Price;
    
    
    public Product() // DEFAULT CONSTRUCTOR
    {
		
	}
    
    
	
    
    public Product(String code, String description, Double price) // PARAMETERIZED CONSTRUCTOR
    
    {
		
		Code = code;
		Description = description;
		Price = price;
	}

	public String getCode() 
	{
		return Code;
	}
	
	public void setCode(String code)
	{
		Code = code;
	}
	
	public String getDescription() 
	{
		return Description;
	}
	
	public void setDescription(String description) 
	{
		Description = description;
	}
	
	public Double getPrice() 
	{
		return Price;
	}
	
	public void setPrice(Double price)
	{
		Price = price;
	}
	

	public String toString() 
	{
		return "Product [Code=" + Code + ", Description=" + Description + ", Price=" + Price + "]";
	}
    
    
}
