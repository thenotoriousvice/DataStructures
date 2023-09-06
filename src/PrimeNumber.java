import java.util.Scanner;

public class PrimeNumber {
    Scanner scn=new Scanner(System.in);
    public String checkPrime() {
        System.out.println("Enter the no. of values");
        int t=scn.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Enter the values of N");
            int n = scn.nextInt();


            int count = 0;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        return ("Done");
    }
}
