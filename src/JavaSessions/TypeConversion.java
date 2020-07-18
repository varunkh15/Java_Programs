package JavaSessions;

public class TypeConversion {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
		String amount = "1000";
		System.out.println(amount + 30);
		
		System.out.println(Integer.parseInt(amount)+30);
		
//		String y = "100A";
//		System.out.println(y+20);
//		
//		int k = Integer.parseInt(y);//NumberFormatException: For input string: "100A"
//		System.out.println(k+20);
		
		String p = "12.33";
		System.out.println(p+100);
		
		double d = Double.parseDouble(p) + 100;
		System.out.println(d);
		
		
		//int to String:
		int am = 1000;
		System.out.println(am+20);
		//1000 + 20 ==? 100020
		
		String st = String.valueOf(am); // "1000"
		System.out.println(st+20);
		
		
	}

}