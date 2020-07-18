package JavaSessions;
public class DownCastingExample 
{
	public static void main(String[] args) 
	{
		SuperClass superClass1 = new SuperClass();
		SuperClass superClass2 = new SubClass();
		//Valid down casting
		SubClass subClass1 = (SubClass)superClass2;
		subClass1.method1();
		//Invalid down casting
		SubClass subClass2 = (SubClass)superClass1;
	}
}
class SuperClass
{
	public void method1()
	{
		System.out.println("Subclass Method Called");
	}
	
}
class SubClass extends SuperClass
{
	public void method2()
	{
		System.out.println("Subclass Method Called");
	}
}