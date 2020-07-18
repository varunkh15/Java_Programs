package JavaSessions;

public class StringReverse {

	public static void main(String[] args) {

		String str = "selenium";
		
		//muineles
		
//		int len = str.length();//8
//		String rev = "";
//		
//		for(int i = len-1; i>=0; i--){
//			
//			rev = rev+str.charAt(i);//m+u+i
//			
//		}
//		
//		System.out.println(rev);
		
//		System.out.println(reverse("test"));
//		System.out.println(reverse("selenium"));
//		System.out.println(reverse("N"));

		
		//using charArray:
		
//		String s = "SeleniumTestAutomation";
//		
//		char c[] = s.toCharArray();
//		
//		for(int i=c.length-1; i>=0; i--){
//			System.out.print(c[i]);
//		}
		
		//StringBuilder:
		String s = "SeleniumTestAutomation";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
		String s1 = "naveen";
		//System.out.println(s1.substring(2,4));
		String s2 = s1.substring(2,4);
		System.out.println(s1);
		System.out.println(s2);
		
		String t1 = "testing";
		String t2 = "testing";
		
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		t2 = t2+"Naveen";
		
		String t3 = t1;
		
		String t4 = new String("naveen");
		String t5 = new String("naveen");

		System.out.println(t4==t5);
		System.out.println(t4.equals(t5));


	}
	
	
	public static String reverse(String str){
		int len = str.length();
		
		if(len==1){
			return str;
		}
		
		String rev = "";
		for(int i = len-1; i>=0; i--){
			rev = rev+str.charAt(i);//m+u+i
		}
		
		return rev;
	}
}