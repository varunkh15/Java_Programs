package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args)
	{
		ThrowsKeyword obj = new ThrowsKeyword();
		try
		{
			obj.getValue();
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		System.out.println("A");
	}
	public void getValue() throws ArithmeticException
	{
		System.out.println("get value");
		getNumber();
	}
	public void getNumber() throws ArithmeticException 
	{
		System.out.println("get number");
		getName();
	}

	public void getName() throws ArithmeticException 
	{
		System.out.println("get name");
		int i = 9 / 0;
	}
}