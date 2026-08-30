// Q.9  To check whether a number is a perfect number or not.
import java.util.*;
class Q9 {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum == num) {
            System.out.print(num + " is perfect number.");
        }else {
            System.out.print(num + " is not perfect number.");
        }
    }
}