// Q.3  To add two Numbers   
import java.util.*;
class Q3 {
    public static void main (String args[]) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.print("Sum is : " + sum);
    }
}