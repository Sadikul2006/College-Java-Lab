// Q.4  To check whether a year is Leap Year or not. 
import java.util.*;
class Q4 {
    public static void main (String args[]) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        year = sc.nextInt();
        
        if (year % 4 == 0) {
            System.out.print(year + " is Leap Year.");
        }else {
            System.out.print(year + " is Not Leap Year.");
        }
    }
} 