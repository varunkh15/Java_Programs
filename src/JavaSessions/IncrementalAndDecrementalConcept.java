package JavaSessions;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {

		// ++ --> inc by 1
		// -- --> dec by 1
		
		int a = 1;
		int b = a++; //post increment
		System.out.println(a);//2
		System.out.println(b);//1
		
		int h = -4;
		int g = h++;
		
		System.out.println(h);//-3
		System.out.println(g);//-4
		
		
		int p = 1;
		int q = ++p; //pre increment
		System.out.println(p);//2
		System.out.println(q);//2
		
		
		int m = 2;
		int n = m--; //post decrement
		System.out.println(m);//1
		System.out.println(n);//2
		
		int c = -3;
		int d = --c;//pre decrement
		System.out.println(c);//-4
		System.out.println(d);//-4
		
		int t1 = -99;
		int t2 = t1--;//post decrement
		System.out.println(t1);//-100
		System.out.println(t2);//-99
		
	}

}