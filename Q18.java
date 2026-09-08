// Q.18 Write a java program to implement fixed size stack of integers.
import java.util.*;
class AllClgLabProgram {

    static int[] stack;
    static int top = -1;
    static Scanner sc = new Scanner(System.in);

    static void push() {
        if (top == stack.length - 1)
            System.out.println("Stack Overflow!");
        else {
            System.out.print("Enter value: ");
            stack[++top] = sc.nextInt();
            System.out.println("Value pushed successfully!");
        }
    }

    static void pop() {
        if (top == -1)
            System.out.println("Stack Underflow!");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    public static void main(String[] args) {
        System.out.print("Enter Stack size: ");
        stack = new int[sc.nextInt()];

        while (true) {
            System.out.print("\n1.Push  2.Pop  3.Exit\nChoose: ");
            int op = sc.nextInt();

            switch (op) {
                case 1 -> push();
                case 2 -> pop();
                case 3 -> { return; }
                default -> System.out.println("Invalid Input!");
            }
        }
    }
}