package ExceptionHandling;

public class TryWithMultipleCatch {

	String name = "naveen";

	public static void main(String[] args) {

		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");

		try {
			int i = 9 / 3;
			System.out.println(i);
			TryWithMultipleCatch obj = null;
			System.out.println(obj.name);
		} 
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());

		} 
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Bye");
	}

}