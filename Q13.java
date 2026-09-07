// Q.13  Write a program to check whether a string is a Palindrome or not
import java.util.*;
class Q13 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String st = sc.next();
        int j = st.length()-1;
        for(int i = 0; i < j/2; i++) {
            if(st.charAt(i) != st.charAt(j-i)) {
                System.out.println("Not Palindrome!");
                return ;
            }
        }
        System.out.println("Palindrome!");
    }
}