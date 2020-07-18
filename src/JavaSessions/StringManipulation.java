package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Hi this is my java code and I am so happy";
		
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(40));
		try 
		{
			System.out.println(str.charAt(41));//StringIndexOutOfBoundsException
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println(str.indexOf('m'));
		System.out.println(str.indexOf('s'));//1st occurrence of s
		System.out.println(str.indexOf("s", 7));//2nd occurrence of s
		System.out.println(str.indexOf("s", str.indexOf('s')+1));
		System.out.println(str.indexOf("java"));
		String mesg = "Welcome Admin";
		if(mesg.indexOf("Admin")>0){
			System.out.println("admin username is present...");
		}
		
		System.out.println(str.indexOf("Naveen"));//-1
		
		//trim:
		String t1  = "    hello world     ";
		System.out.println(t1.trim());
		
		//UPPER CASE:
		String test = "welcome Selenium";
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		
		//replace:
		String dob = "1-1-1990"; //1/1/1990
		
		System.out.println(dob.replace("-", "/"));
		
		String t2 = "   welcome testing    ";
		System.out.println(t2.replace(" ", ""));
		//System.out.println(t2.trim().replace(" ", ""));
		
		//contains:
		String message  = "Welcome admin user";
		System.out.println(message.contains("admin"));
		
		if(message.contains("admin")){
			System.out.println("admin is present....");
		}
		
		//string comparison:
		String  p1 = "hello this is java here";
		String p2 = "hello this is Java here";
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equalsIgnoreCase(p2));
		
		//subString:
		String longMesg = "hi this is my automation code";
		System.out.println(longMesg.substring(0, 7));
		
		String confirmMesg = "your order number is 12345"; //12345
		
		System.out.println(confirmMesg.substring(confirmMesg.indexOf("is")+3, confirmMesg.length()));
		
		System.out.println(confirmMesg.substring(confirmMesg.indexOf("is")+3));
		
		String p3 = "this is selenium code";
		System.out.println(p3.substring(5));
		
		
		//split:
		String lang = "Java-Python-Ruby-JavaScript";
		
		String langArr[] = lang.split("-");
		System.out.println(langArr[0]);
		
		for(int i=0; i<langArr.length; i++){
			System.out.println(langArr[i]);
		}
		
		String h1 = "xXAnushaxXRufatXxXSheena";
		
		String h2[] = h1.split("xX");
		
		System.out.println(h2[1]);
		System.out.println(h2[2]);
		System.out.println(h2[3]);
		String empData = "Kan;Oberoi;30;SFO;CA;IBM;909090";
		System.out.println(empData);
		for(int i=0; i<empData.split(";").length; i++)
		{
			System.out.println(empData.split(";")[i]);
			
		}
		
		
//		String fn = empData.split(";")[0];
//		String ln = empData.split(";")[1];
//		String age = empData.split(";")[2];
//		String city = empData.split(";")[3];
//		String state = empData.split(";")[4];
//		String comp = empData.split(";")[5];
//		String phone = empData.split(";")[6];
//		System.out.println(fn);
//		System.out.println(city);
		
		
	}

}