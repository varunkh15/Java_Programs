package JavaSessions;

public class Array_Assignment {

        public static void main(String[] args) {
                
                /*Question 1: Write a program to print the following pattern using for loop:

                        00 01 02 03 04 05 06 07 08 09 
                        10 11 12 13 14 15 16 17 18 19 
                        20 21 22 23 24 25 26 27 28 29 
                        30 31 32 33 34 35 36 37 38 39
        */

                for(int i = 0; i<4; i++){
                        for(int j =0; j<=9; j++){
                                System.out.print(i+""+j +"\t");
                        }
                        System.out.println();
                }
                
                /*Question 2: Write a program to create a static Array, having following cricket data:
                        --name, age, team name, DOB, gender, Strike Rate
                        --Try to create multiple Object Arrays for different players 
                        --Try to print all the values of each player on the console*/
                
        String emp[] = new String[1];
        emp[0] = "Raheem";
        int empage[] = new int[1];
        empage[0] = 26;
        String empteam[] = new String[1];
        empteam[0] = "Vikings";
        int empdob[] = new int[1];
        empdob[0] = 1993;
        boolean empg[] = new boolean[1];
        empg[0] = "M" != null;
        double empsr[] = new double[1];
        empsr[0] = 116.8;
        
        System.out.println("Name: "+emp[0]);
        System.out.println("Age: "+empage[0]); 
        System.out.println("Team: "+empteam[0]);
        System.out.println("DOB: "+empdob[0]);
        System.out.println("Gender: "+empg[0]);
        System.out.println("Strike Rate: "+empsr[0]);
        System.out.println("---------------------");
        
        Object Player1[] =new Object[6];
        Player1[0] = "John";
        Player1[1] = 28;
        Player1[2] = "Packers";
        Player1[3] = 1988;
        Player1[4] = "Male";
        Player1[5] = 156.78;
        
        
        Object Player2[] =new Object[6];
        Player2[0] = "Tom";
        Player2[1] = 29;
        Player2[2] = "Eagles";
        Player2[3] = 1990;
        Player2[4] = "Male";
        Player2[5] = 152.18;
        

        Object Player3[] =new Object[6];
        Player3[0] = "Hudson";
        Player3[1] = 19;
        Player3[2] = "GreenBay";
        Player3[3] = 2000;
        Player3[4] = "Male";
        Player3[5] = 123.68;
        
        for(int counter = 0; counter<Player1.length; counter++) {
                System.out.println(Player1[counter]);
        }
        System.out.println("---------------------");
        for(int counter = 0; counter<Player2.length; counter++) {
                System.out.println(Player2[counter]);
        }
        System.out.println("---------------------");
        for(int counter = 0; counter<Player3.length; counter++) {
                System.out.println(Player3[counter]);
        }
        System.out.println("---------------------");
        
                /*Question 3: Try to print the following pattern on the console:
                        n = 4
                        n = 3
                        n = 2
                        n = 1
                        n = 0*/
                
                int n[] = new int[5];
                n[0] = 4;
                n[1] = 3;
                n[2] = 2;
                n[3] = 1;
                n[4] = 0;
                
                for(int k = 0; k<n.length; k++)
                {
                        System.out.println("n = "+n[k]); 
                }
                                        
                        
                        
                        
                        
                        
                        
                        
                }
}
