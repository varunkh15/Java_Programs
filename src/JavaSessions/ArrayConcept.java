package JavaSessions;

public class ArrayConcept {

	public static void main(String []ar) {

		//Array:
		
		//1. static array: 
			//two major limitations of array:
			//size is fixed -- static array: to overcome this issue, we use ArrayList or dynamic collection
			//can  store only similar types of data -- its homogeneous array -- to solve this issues,we can use Object Array
		
		//2. dynamic array: where size is dynamic -- ArrayList or any collection in Java
		
		//1. int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[1]+i[2]);
		
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		System.out.println(i.length);
		
		//print all the values of array: for loop:
		
		for(int k=0; k < i.length; k++){
			System.out.println(i[k]);//10 20 30 40 
		}
		
		//2. double array:
		double d[] = new double[2];
		//l = 2
		//hi = l-1 = 1
		//li = 0
		
		d[0] = 12;
		d[1] = 13.44;
		
		System.out.println(d[0]+d[1]);
		
		//3. char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '$';
		
		System.out.println(c[0]+c[1]);
		
		//4. String array:
		String s[] = new String[3];
		s[0] = "Java";
		s[1] = "Python";
		s[2] = "Ruby";
		
		for(int l=0; l<s.length; l++){
			System.out.println(s[l]);
		}
		
		String studentNames[] = new String[5];
		
		//5. boolean array:
		boolean b[] = new boolean[2];
		
		
		//6. Object Array:
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 'm';
		ob[3] = 34.44;
		ob[4] = false;
		System.out.println(ob[5]);
		
		for(int u=0; u<ob.length; u++){
			System.out.println(ob[u]);
		}
		
		int t[] = new int[10];
		t[0]=10;
		t[1]=20;
		t[2]=30;
		
		System.out.println(t[2]);
		System.out.println(t[3]);
		
		String str[] = new String[5];
		str[0] = "test";
		System.out.println(str[0]);
		System.out.println(str[1]);		
	}

}
