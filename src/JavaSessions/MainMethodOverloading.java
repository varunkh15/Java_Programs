package JavaSessions;

public class MainMethodOverloading {

	public static void main(String ar[]) {
		System.out.println("This is main method....");
		
		main(10);
		main(10,20);
		
	}

	public static void main(int i) {
		System.out.println(i);
	}
	
	public static void main(int i, int j) {
		System.out.println(i+j);
	}

}