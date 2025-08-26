import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number for the countdown: ");
        int startValue = scanner.nextInt();

        System.out.println("\nPrepare for launch! Countdown initiated...");

        for (int i = startValue; i > 0; i--) {
            System.out.println("T-minus " + i + "...");
        }

        System.out.println("LIFTOFF!");

        scanner.close();
    }
}