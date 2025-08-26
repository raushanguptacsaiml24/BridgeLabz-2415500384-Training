import java.util.Scanner;
public class FirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number1");
        int number1 = sc.nextInt();
        System.out.println("Enter your number2");
        int number2 = sc.nextInt();
        System.out.println("Enter your number3");
        int number3 = sc.nextInt();

        if(number1 < number2 && number1 < number3)
        {
           System.out.println("Smallest number is first number ");
        }
        else
        {
            System.out.println("Not first is not smallest number");
        }
        sc.close();
    
    }
}
