// Q.1 Input n numbers on Command Line Argument and calculate maximum of them.

// class AllClgLabProgram {
//     public static void main(String args[]) {

//         int max = Integer.MIN_VALUE;

//         for(int i = 0; i < args.length; i++) {
//             int num = Integer.parseInt(args[i]);

//             if(num > max)
//                 max = num;
//         }

//         System.out.println("Maximum Number is : " + max);
//     }
// }



// Q.2 To print sum and average of even and odd numbers separately given on Command Line Argument.

// class AllClgLabProgram {
//     public static void main(String args[]) {

//         int oddCount = 0, evenCount = 0, oddSum = 0, evenSum = 0;

//         for(int i = 0; i < args.length; i++) {
//             int num = Integer.parseInt(args[i]);

//             if(num % 2 == 0) {
//                 evenCount++;
//                 evenSum += num;
//             }else{
//                 oddCount++;
//                 oddSum += num;
//             }
//         }

//         double evenAvg = (double) evenSum / evenCount;
//         double oddAvg = (double) oddSum / oddCount;


//         System.out.println("Even Sum : " + evenSum);
//         System.out.println("Odd Sum : " + oddSum);
//         System.out.printf("Even Avg : %.2f%n", evenAvg);
//         System.out.printf("Odd Avg : %.2f%n", oddAvg);
//     }
// }

// Q.3  To add two Numbers   
// import java.util.*;
// class AllClgLabProgram {
//     public static void main (String args[]) {
//         int num1, num2, sum;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter First Number : ");
//         num1 = sc.nextInt();
//         System.out.print("Enter Second Number : ");
//         num2 = sc.nextInt();

//         sum = num1 + num2;
//         System.out.print("Sum is : " + sum);
//     }
// }


// Q.4  To check whether a year is Leap Year or not. 
// import java.util.*;
// class AllClgLabProgram {
//     public static void main (String args[]) {
//         int year;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter year : ");
//         year = sc.nextInt();
        
//         if (year % 4 == 0) {
//             System.out.print(year + " is Leap Year.");
//         }else {
//             System.out.print(year + " is Not Leap Year.");
//         }
//     }
// }  


// Q.5  Multiply a number by 4 and divide the same number by 2 using shift operator. 
// import java.util.*;
// class AllClgLabProgram {
//     public static void main (String args[]) {
//         int num;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         num = sc.nextInt();
        
//         int multiply = num << 2;   // (4 == 2^2)
//         int divide  = num >> 1;    // (2 == 2^1)
        
//         System.out.println(num + " multiply by 4 : " + multiply);
//         System.out.print(num + " divide by 2 : " + divide);
//     }
// }  


// Q.6  Swap two numbers Without using any arithmetic operator.
// import java.util.*;
// class AllClgLabProgram {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("a = ");
//         int a = sc.nextInt();
//         System.out.print("b = ");
//         int b = sc.nextInt();

//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;
        
//         System.out.println("After Swaping : ");
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
// }


// Q.7  Convert long to int. 
// class AllClgLabProgram {
//     public static void main(String args[]) {
//         long num = 1000000L;
//         int result = (int) num;

//         System.out.println("Long Value : " + num);
//         System.out.println("Int Value : " + result);
//     }
// }



// Q.8  Find the ASCII value of a Character.
// import java.util.Scanner;
// class AllClgLabProgram {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Character : ");
//         char ch = sc.next().charAt(0);

//         int ascii_val = (int) ch;
        
//         System.out.println("ASCII Value of " +  ch + " : " + ascii_val);
//     }
// } 



// Q.9  To check whether a number is a perfect number or not.
// import java.util.*;
// class AllClgLabProgram {
//     public static void main(String args[]) {
//         int sum = 0;
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Number : ");
//         int num = sc.nextInt();

//         for(int i = 1; i < num; i++) {
//             if(num % i == 0) {
//                 sum += i;
//             }
//         }

//         if(sum == num) {
//             System.out.print(num + " is perfect number.");
//         }else {
//             System.out.print(num + " is not perfect number.");
//         }
//     }
// } 



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




// Q.11  To check whether a number is Prime or not.    
// Q.12  write a program to demonstrate that String class is immutable whereas String Buffer and StringBuilder are mutable.    
// Q.13  Write a program to check whether a string is a Palindrome or not    
// Q.14  Write a program to count the occurrence of the given character in a string?    
// Q.15  Write a program to count no of vowels and consonants from a String.    
// Q.16  Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of the rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.    17.  Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.    18.  Write a java program to implement fixed size stack of integers.    19.  Write a java program to overload three methods named with addition() having different parameters. 