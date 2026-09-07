// Q.12  write a program to demonstrate that String class is immutable whereas String Buffer and StringBuilder are mutable.
class Q12 {
    public static void main(String args[]) {

        // String - Immutable
        String str = "Hello";
        str.concat(" World");

        System.out.println("String: " + str);

        // StringBuffer - Mutable
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");

        System.out.println("StringBuffer: " + sb);

        // StringBuilder - Mutable
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" World");

        System.out.println("StringBuilder: " + sbd);
    }
}