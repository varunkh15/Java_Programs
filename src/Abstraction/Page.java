package Abstraction;

public abstract class Page 
{
	public Page()
	{
		System.out.println("Page class -- const....");
	}
	
	abstract void header();
	
	abstract void title();
	
	public final void footer()
	{
		System.out.println("page -- footer");
	}
	
	public static void plugin()
	{
		System.out.println("Page  -- plugins");
	}
	
	//can not create the object of abstract class
	//abstract class const... can be created
	//it will be called when you create child class object
	
	//abst.. class can have  abst.. methods and non abstract.. methods...
	///partial abstraction
	
	//abst.. class can have all abst.. methods
	//100% abstraction
	
	//abst.. class we have all non abst... methods
	//0% abstraction
	
	//0 to 100% abstraction
}