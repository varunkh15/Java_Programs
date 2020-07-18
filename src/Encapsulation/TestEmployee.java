package Encapsulation;

public class TestEmployee {
	
public static void main(String[] args) 
{

		Employee e1 = new Employee();
		
		e1.setName("Tom");
		System.out.println(e1.getName());
		System.out.println(e1.name);
		
		e1.setAge(25);
		System.out.println(e1.getAge());
		
		e1.setSalary(1000);
		System.out.println(e1.getSalary());

}
}
