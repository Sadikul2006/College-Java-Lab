// Q.8  Find the ASCII value of a Character.
import java.util.Scanner;
class Q8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character : ");
        char ch = sc.next().charAt(0);

        int ascii_val = (int) ch;
        
        System.out.println("ASCII Value of " +  ch + " : " + ascii_val);
    }
} 