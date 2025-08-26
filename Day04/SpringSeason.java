import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number (1-12): ");
        int month = sc.nextInt();
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("It's Spring Season!");
        } else {
            System.out.println("It's not Spring Season.");
        }
        sc.close();
    }
}
