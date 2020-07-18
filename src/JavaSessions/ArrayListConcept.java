package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		//ArrayList - is a default class in Java
		//Collection(Interface) --  ---> List (Interface) ---> ArrayList (Class)
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//3
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());//5
		
		System.out.println(ar.get(2));
		System.out.println(ar.get(4));
		//System.out.println(ar.get(5));// IndexOutOfBoundsException
		//System.out.println(ar.get(-1));
		
		
		ar.add(600);//5
		ar.add(700);//6
		
		ar.add("Naveen");//7
		ar.add(true);//8
		ar.add(12.33);//9
		
		ar.remove(4);
		System.out.println(ar.get(4));//600
		
		System.out.println("---------");
		
		//Generics in Java:
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(400);
		
		for(int i : marks){
			System.out.println(i);
		}
		
		System.out.println("---------");

		
		ArrayList<Double> score = new ArrayList<Double>();
		score.add(12.33);
		score.add(100.0);
		
		ArrayList<String> studentsList = new ArrayList<String>();
		studentsList.add("Shaan");//0
		studentsList.add("Anusha");//1
		studentsList.add("Aman");//2
		studentsList.add("Aman");//3
		studentsList.add(null);//4
		studentsList.add(null);//5

		System.out.println(studentsList.get(1));
		//to print all the values from ArrayList: for loop:
		for(int i=0; i < studentsList.size(); i++)
		{
			System.out.println(studentsList.get(i));
		}
		//for each loop:
		for(String s : studentsList)
		{
			System.out.println(s);
		}
		
	}

}
