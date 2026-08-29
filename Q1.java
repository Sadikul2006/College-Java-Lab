// Q.1 Input n numbers on Command Line Argument and calculate maximum of them.

class Q1 {
    public static void main(String args[]) {

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if(num > max)
                max = num;
        }

        System.out.println("Maximum Number is : " + max);
    }
}