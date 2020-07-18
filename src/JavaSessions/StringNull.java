package JavaSessions;

public class StringNull 
{
public static void main(String args[])
{
	String[] arr = {"001","002","003"};
	for(int i=0;i<arr.length;i++)
	{
		String var = null;
		var = var + arr[i];
		System.out.println(var);
	}
}
}
