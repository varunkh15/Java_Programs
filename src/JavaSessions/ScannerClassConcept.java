package JavaSessions;

import java.util.Scanner;

public class ScannerClassConcept {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		String empName = sc.nextLine();
		
		char gender = sc.next().charAt(0);
		
		int age = sc.nextInt();
		
		long phoneNumber = sc.nextLong();
		
		double salary = sc.nextDouble();

		
		System.out.println("empName : " + empName);
		System.out.println("gender: " + gender);
		System.out.println("age :"+ age);
		System.out.println("phoneNumber :"+ phoneNumber);
		System.out.println("salary :"+ salary);






	}

}