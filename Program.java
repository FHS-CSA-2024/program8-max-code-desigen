//import stuff here

//Your code here
import java.util.Scanner; 
import java.lang.Math.*;

class program {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in); 
        
        System.out.println  ("Enter number 1: ");
        int numA = myScanner.nextInt(); 
        
        System.out.println ("Enter number 2: ");
        int numB = myScanner.nextInt(); 
        
        System.out.println ("Original numbers are " + numA + " and " + numB); 
        
        
        
        int sum = numA + numB; 
        System.out.println ("Sum = " + sum);
        
        int diff = numA-numB; 
        System.out.println ("Difference = " + diff); 
        
        int prod = numA * numB; 
        System.out.println ("Product = " + prod); 
        
        double avg = (double)(numA + numB)/2.0; 
        System.out.println ("Average = " + avg); 
        
        int dist = Math.abs (numA - numB);
        System.out.println ("Absolute value = " + dist); 
        
        int max = (numA + numB + Math.abs (numA - numB))/2; 
        System.out.println ("Maximum = " + max); 
        
        int min = (numA + numB - Math.abs (numA - numB))/2; 
        System.out.print("Minimum = " + min); 
        
        
    }
}



//Paste console output below:
/*
Enter number 1: 
13
Enter number 2: 
20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum = 20
Minimum = 13

*/
