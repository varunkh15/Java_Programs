   package JavaSessions;

public class StaticVsNonStaticConcept {
	
	String name;
	static int age;
	
	public void getName()
	{
		System.out.println("get name...");
	}
	
	public static void display()
	{
		System.out.println("display method....");
	}
	

	public static void main(String[] args) {

		//how to call static vars and methods: no need to create the object
		//a. direct calling
		display();
		age = 25;
		System.out.println(age);
		
		//b. by using className:
		StaticVsNonStaticConcept.display();
		System.out.println(StaticVsNonStaticConcept.age);
		
		//c. Static method can be overloaded but cannot be overridden
		
		//how to call non static stuff: need to create the object
		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();
		
		obj.name = "Vimal";
		System.out.println(obj.name);
		System.out.println(age);
		display();
		
		
	}

}