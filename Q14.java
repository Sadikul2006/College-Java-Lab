// Q.14  Write a program to count the occurrence of the given character in a string? 
import java.util.*;
class Q14 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();
        System.out.print("Enter Character : ");
        Character ch = sc.next().charAt(0);

        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) count++;
        }

        System.out.println("Occurrence : " + count);
    }
}