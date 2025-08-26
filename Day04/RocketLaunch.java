import java.util.Scanner; 

public class RocketLaunch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the starting number for the countdown: ");
        int counter = scanner.nextInt(); 

        System.out.println("\nPrepare for launch! Countdown initiated...");

        
        while (counter > 0) {
            
           
            System.out.println("T-minus " + counter + "...");

           
            counter--; 
        }

        System.out.println("LIFTOFF!");
        scanner.close();
    }
}