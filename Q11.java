// Q.11 To check whether a number is Prime or not.
import java.util.*;

class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        boolean is_prime = true;

        if (num <= 1) {
            is_prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    is_prime = false;
                    break;
                }
            }
        }

        if (is_prime == false) {
            System.out.println(num + " is not a prime number!");
        } else {
            System.out.println(num + " is a prime number!");
        }
    }
}