package Abstraction;

public class HomePage extends Page
{
	
	public HomePage()
	{
		System.out.println("Home Page -- Const....");
	}
	
	@Override
	void header()
	{
		System.out.println("HP - header");
	}

	@Override
	void title() 
	{
		System.out.println("HP - title");
	}
	
	public void userDetails()
	{
		System.out.println("HP - user details");
	}
	
}