import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] arge) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");

        int number2 = sc.nextInt();
        System.out.println("Enter third number");
        int number3 = sc.nextInt();

        if(number1>number2 && number1 > number3)
        {
            System.out.println("Print Largest number is number first " + number1);
        }
        else if(number2>number1 && number2>number3)
        {
            System.out.println("largest number is number second " +number2);
        }
        else
        {
            System.out.println("Largets number is number third "  + number3);
        }
        sc.close();
    }
    
}
