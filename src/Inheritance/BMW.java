package Inheritance;

public class BMW extends Car{
	
	//Method Overriding: when you have a method in parent class with the same name 
	//and same number of params and the same method in child class (with the same signature)
	//is called -- Method Overriding
	
	@Override
	public void start(){
		System.out.println("BMW -- start");
	}
	
	public void autoParking(){
		System.out.println("BMW -- auto parking");
	}
	

}