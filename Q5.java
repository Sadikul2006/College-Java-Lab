// Q.5  Multiply a number by 4 and divide the same number by 2 using shift operator. 
import java.util.*;
class Q6 {
    public static void main (String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num = sc.nextInt();
        
        int multiply = num << 2;   // (4 == 2^2)
        int divide  = num >> 1;    // (2 == 2^1)
        
        System.out.println(num + " multiply by 4 : " + multiply);
        System.out.print(num + " divide by 2 : " + divide);
    }
}  