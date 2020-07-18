package JavaSessions;

public class DataTypes {
	
//	this is my first java code, im so happy
	
	/*hi this is
	my java code
	and 
	im so happy*/

	public static void main(String[] args) {

		//data types:
		//1. non primitive data types: String,  Array
		//2. primitive data types:
			//a. Boolean : true false
			//b. Numeric : 
				//1. Character : char
				//2. Integral : byte short int long
					//2.1: floating point : float, double
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range : -128 to 127 == 256
		byte b = (byte)250;//250-256 = -6
		System.out.println(b);
		b = 20;
		System.out.println(b);
		byte b1 = -10;
		byte b2 = 0;
		
		//2. short:
		//size: 2 bytes = 16 bits
		//range : -32767  to 32768
		short s1 = (short)50000;
		System.out.println(s1);
		
		//3. int:
		//size: 4 bytes = 32bits
		//range: -2^31 to + 2^31-1
		int i = 120;
		System.out.println(i+20);
		int j = 190;
		int p = '1';
		System.out.println(p);
		
		//4. long:
		//size: 8 bytes = 64 bits
		//range : -2^63 to +2^63-1
		long distance = 12121212121l;
		System.out.println(distance);		
		//salary, hairs		
				
				
		//5. float:
		//size: 4 bytes = 32 bits
		//range: after . up to 8 digits
		float f1 = 12.33f;
		float f2 = (float)12.44;
		System.out.println(f2);
		float f3 = 100; //100.0
		System.out.println(f3);//100.0
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range : after . upto 15 digits
		double d = 12.33333;
		//12.33333 x 34.5555555 = 		
				
		//7. char :
		char c = 'a';//97
		char c1 = 'b';//98
		char c2 = '$';
		char gender = 'f';
		
		//a-z ==97 to 122
		//A_z ==> 65 to 90
		//0 to 9 --> 48 to 57
		
		System.out.println(c);
		System.out.println(c+c1);//195
		
				
		//8. boolean:
		boolean flag = true;
		boolean flag1 = false;		
		
		
	}

}