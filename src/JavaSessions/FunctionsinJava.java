package JavaSessions;

public class FunctionsinJava {

	public static void main(String[] args) {

		FunctionsinJava obj = new FunctionsinJava();
		obj.test();
		String n1 = obj.getTrainerName();
		System.out.println(n1);
		System.out.println(obj.getTrainerName());

		int sum = obj.getTotal();
		System.out.println(sum);
		System.out.println(obj.getTotal());

		int s1 = obj.add(10, 20);
		System.out.println(s1);

		int s2 = obj.add(40, 50);
		System.out.println(s2 + 40);

		System.out.println(obj.add(40, 60));

		System.out.println(obj.isUSCitizen("NavEEn"));
		
		System.out.println(obj.getStudentMarks("Tom"));

	}

	// three types of methods:

	// 1. simple methods: does not return any thing and doesnt not take any
	// parameter:
	// void type:
	// no ip and np op: no return keyword: void : does not return anything...
	// //return type: void
	public void test() {
		System.out.println("test method....");
	}

	// 2. no input but some return:
	// //return type: String
	public String getTrainerName() {
		System.out.println("get trainer name....");
		String name = "Naveen";

		return name;
	}

	// return type: int
	public int getTotal() {
		System.out.println("getTotal...");
		int a = 100;
		int b = 200;
		int total = a + b;// 300

		return total;
	}

	// 3. some input and some return:
	public int add(int a, int b) {
		System.out.println("add method...");
		int z = a + b;
		return z;
	}

	// return boolean:
	public boolean isUSCitizen(String name)
	{
		boolean flag = false;
		if (name.equalsIgnoreCase("Naveen")) 
		{
			flag = true;
		} 
		else if (name.equalsIgnoreCase("Tom")) 
		{
			flag = true;
		} 
		else if (name.equalsIgnoreCase("Peter")) 
		{
			flag = true;
		}
		return flag;
	}
	
	
	public int getStudentMarks(String name){
		int marks = -1;
		
		if(name.equals("Shivangi")){
			marks = 100;
		}
		else if(name.equals("Sudha")){
			marks = 95;
		}
		else if(name.equals("Naveen")){
			marks = 10;
		}
		else{
			System.out.println(name + " is not found....");
		}
		
		return marks;
		
	}
}
	