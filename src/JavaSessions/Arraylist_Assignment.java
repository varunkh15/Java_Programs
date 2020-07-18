package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist_Assignment {

        public static void main(String[] args) {
                
                /*1. Write a Java program to create a new array list,
                 *  add some colors (string) a
                nd print out the collection*/
                
                ArrayList ar = new ArrayList();
                ar.add("red");
                ar.add("blue");
                ar.add("green");
                ar.add("purple");
                ar.add("brown");
                System.out.println(ar.size());
                
                for(int counter = 0; counter<ar.size(); counter++) {
                        System.out.println(ar.get(counter));
                }
                
/* 2. Write a Java program to insert
 *  an element into the array list at the first and last positions.*/
                
                ar.add(0, "black");
                ar.add(ar.size(), "pink");
                
                System.out.println(ar.size());
                for(int counter = 0; counter<ar.size(); counter++) {
                        System.out.println(ar.get(counter));
                }
                
                /* 3. Write a Java program to retrieve an element 
                 * (at a specified index) from a given array list.
                 */
                
                System.out.println(ar.get(4));
                System.out.println(ar.get(1));
                
                /* 4. Write a Java program to update specific array 
                 * element by given element.
                 * 
                 */
                
                ar.set(2, "Magenta");
                ar.set(4, "orange");
                System.out.println(ar.size());
                for(int counter = 0; counter<ar.size(); counter++) {
                        System.out.println(ar.get(counter));
                
                }
                
                System.out.println("------------------");
                /* 5. Write a Java program to remove the third 
                 * element from a array list. 
                 * 
                 */
                ar.remove(1);
                for(int counter = 0; counter<ar.size(); counter++) {
                        System.out.println(ar.get(counter));
                
        }
       /* 6. Write a Java program to search an element in a array list.
        * 
        */
                //boolean ans = ar.contains("brown");
                
                if(ar.contains("brown")) 
                        System.out.println("brown is there"); 
                        else 
                                System.out.println("brown is not there");
                        
                        /* 7. Write a Java program to reverse elements in a array list
                         *         
                         */
                System.out.println("-----------------");
                        Collections.reverse(ar);
                        for(int counter = 0; counter<ar.size(); counter++) {
                                System.out.println(ar.get(counter));
                        
                }


/**
7. Rever the array List:

*/
ArrayList<String> studentNames = new ArrayList<String>();
                studentNames.add("Varun");
                studentNames.add("Reena");
                studentNames.add("Naveen");

                for(int i=studentNames.size()-1; i>=0; i--){
                        System.out.println(studentNames.get(i));
                }
                
                Collections.reverse(studentNames);
                System.out.println(studentNames);


                        
                /* 8. Write a Java program to extract a portion of a array list.
                 *         
                 */
                List<String> list = ar.subList(1, 4) ;
                System.out.println(list);
                
                int a = 4;
                int b = 2;
                int c = a+b;
                a = b;
                b = c-a;
                
                
                
                System.out.println(a);
                System.out.println(b);
        
                /* 10. Write a Java program to empty an array list.
                 * 
                 */
                System.out.println(ar);
                
                //ar.removeAll(ar);
                
                //System.out.println(ar);
                
                /* 11. Write a Java program to trim the virtual capacity of an
                 *  array list the current list size.
                 * 
                 * 
                 */
                ar.trimToSize();
                System.out.println(ar);
                
                /*
                 * 12. Write a Java program to print all the elements of a
                 *  ArrayList using the position of the elements
                 */
                for(int counter = 0; counter<ar.size(); counter++) {
                        System.out.println(ar.get(counter));
                
        }
                
                }
}

