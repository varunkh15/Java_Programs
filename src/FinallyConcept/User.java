package FinallyConcept;

public class User {

	public static void test() {

		System.out.println("Hii");

		try {
			int i = 9 / 0;
			System.out.println("Bye!");
		} 
		
		catch (NullPointerException e) {
			System.out.println("/ by  zero issue...");
		}
		
		finally{
			System.out.println("this is finally....you cant stop me....");
		}
		

	}

	public static void main(String[] args) {

		test();
		
		
	}

}