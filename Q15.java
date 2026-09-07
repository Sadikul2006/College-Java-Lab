// Q.15  Write a program to count no of vowels and consonants from a String.
import java.util.*;
class Q15 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();

        int vowels = 0, consonants = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || 
            str.charAt(i) == 'I' || str.charAt(i) == 'O' || 
            str.charAt(i) == 'U' || str.charAt(i) == 'a' || 
            str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
            str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("vowels : " + vowels);
        System.out.println("consonants : " + consonants);
    }
}