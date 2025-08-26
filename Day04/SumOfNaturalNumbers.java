import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n) to find the sum of natural numbers: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: The input must be a natural number (greater than 0).");
        } else {
            long loopSum = 0;
            int i = 1;
            
            while (i <= n) {
                loopSum += i;
                i++;
            }

            long formulaSum = (long) n * (n + 1) / 2;

            System.out.println("Sum calculated using while loop: " + loopSum);
            System.out.println("Sum calculated using formula n*(n+1)/2: " + formulaSum);

            if (loopSum == formulaSum) {
                System.out.println("The results match. Both computations are correct.");
            } else {
                System.out.println("Error: The results do not match.");
            }
        }

        scanner.close();
    }
}