package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//1 to 10:
		//loops:
		//1. while:
		
		int i = 1;
		
		while(i<=10){
			System.out.println(i);//1 2 3 4 5 6...10
			i++;
			//i = i+1;
		}
		
		//10 to 1:
		int  p = 10;
		
		while(p>=1){
			System.out.println(p);//10 9 8 7 .....1
			p--;
		}
		
//		boolean flag = false;
//		while(!flag){
//			System.out.println("Welcome to Java World!!!");
//		}
		
		//2. for loop:
		
		//1 to 10:
		for(int k = 1; k<=10; k++){
			System.out.println(k+ " ");//1 2 3 5 6 ...10
		}
		
//		for(; ;){
//			System.out.println("Welcome !!!");
//		}
		System.out.println("---------");
		
		// odd numbers: 1 3 5 7 9
		for(int odd=1; odd<=10; odd=odd+2){
			System.out.println(odd);//1 3 5 7 9
		}
		System.out.println("---------");

		
		// even numbers:  0 2 4 6 8 10
		for(int even=0; even<=10; even= even+2){
			System.out.println(even);
		}
		
		// 15 % 5 = 0
		// 15 / 5 = 3
		
		//for with if :
		for(int m=1; m<=100; m++){
			//5 10 15 20 25 30 35 .... 100
			System.out.println(m);
			if(m % 5 == 0){
				System.out.println("Hello Naveen!!!");
			}
		}
		
		
		System.out.println("---------");

		
		//if number is % by 7, break the loop:
		for(int num=1; num<=100; num++){
			System.out.println(num);
				if(num % 7 == 0){
					System.out.println("number is divisble by 7, BYE!!!");
					break;
				}
		}
		
		System.out.println("-------");
		
		//3. do - while:
		int count = 21;
		
		do{
			System.out.println(count);//21
			count++;
		}
		while(count<20);
		
		
		
		
		
		
	}

}