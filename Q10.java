// Q.10  To check Armstrong number. 
import java.util.*;
class AllClgLabProgram {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int c = 0, sum = 0, temp = num;
        while(temp > 0) {
            temp /= 10;
            c++;
        }

        temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            sum += Math.pow(digit, c);
        }

        if(num == sum) {
            System.out.print(num + " is Armstrong Number.");
        }else {
            System.out.print(num + " is Not Armstrong Number.");
        }
    }
}