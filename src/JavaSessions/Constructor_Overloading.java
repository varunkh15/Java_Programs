package JavaSessions;

public class Constructor_Overloading {

	String name;
	int age;
	long phone;

//	public Constructor_Overloading() { //0 param or default const...
//		System.out.println("default const....");
//	}
//
//	public Constructor_Overloading(int i) { //1 param const...
//		System.out.println("1 param const..." + i);
//	}

	public Constructor_Overloading(String name, int age, long phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public Constructor_Overloading(String name){
		this.name = name;
	}
	
	public Constructor_Overloading(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String a[]) {

		//call const... create the object:
		//Constructor_Overloading p1 = new Constructor_Overloading(10);

		Constructor_Overloading p1 = new Constructor_Overloading("Tom", 25, 909090);
		Constructor_Overloading p2 = new Constructor_Overloading("Kan", 26, 898989);
		Constructor_Overloading p3 = new Constructor_Overloading("Riddhi", 30, 877888);
		Constructor_Overloading p4 = new Constructor_Overloading("Naveen", 20, 89898999);

		
		System.out.println(p1.name + " " + p1.age + " "+ p1.phone);
		System.out.println(p2.name + " " + p2.age + " "+ p2.phone);
		System.out.println(p3.name + " " + p3.age + " "+ p3.phone);

		System.out.println(p4.name + " " + p4.age + " "+ p4.phone);
	}

}