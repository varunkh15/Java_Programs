package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try{
			System.out.println("B");
			int i = 9/0;
			System.out.println("B");
			System.out.println("B");
		}
		catch(ArithmeticException e){
			System.out.println("we got an exception....");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");


	}
}