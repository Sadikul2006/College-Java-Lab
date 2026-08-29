// Q.2 To print sum and average of even and odd numbers separately given on Command Line Argument.

class Q2 {
    public static void main(String args[]) {

        int oddCount = 0, evenCount = 0, oddSum = 0, evenSum = 0;

        for(int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if(num % 2 == 0) {
                evenCount++;
                evenSum += num;
            }else{
                oddCount++;
                oddSum += num;
            }
        }

        double evenAvg = (double) evenSum / evenCount;
        double oddAvg = (double) oddSum / oddCount;


        System.out.println("Even Sum : " + evenSum);
        System.out.println("Odd Sum : " + oddSum);
        System.out.printf("Even Avg : %.2f%n", evenAvg);
        System.out.printf("Odd Avg : %.2f%n", oddAvg);
    }
}