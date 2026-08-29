// Q.6  Swap two numbers Without using any arithmetic operator.
import java.util.*;
class Q6 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
         
        System.out.println("After Swaping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}