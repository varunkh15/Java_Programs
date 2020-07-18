package Interface;

public interface USMedical {
	
	int min_fee = 10;
	
	//abstract methods
	public void orthoServices();
	
	public void neuroServices();
	
	public void Services_911();
	
	//can not create the object of Interface
	//can not have method body
	//can have only method prototype or method declaration
	//interface vars are by default static and final
	
	//we can not have static method prototypes in Interface

	
	//after JDK 1.8 :
	
	//1. can have static method with method body:
	public static void display(){
		System.out.println("USMedical - display");
	}
	
	//2. can have default method with body:
	public default void billing(){
		System.out.println("USMedical - billing");
	}
	
	
	
}