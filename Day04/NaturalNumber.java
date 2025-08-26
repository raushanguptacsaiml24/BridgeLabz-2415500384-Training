import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] arge)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive number");
        int number = sc.nextInt();
        int sum = 0;
        if(number <0)
        {
            System.out.println("Please enter a positive number");
        }
        else
        {
            for(int i= 0;i<=number;i++)
            {
                sum = sum + i;
            }
        }
        System.out.println("Sum of " +number + " natural numbers is: " + sum);
        sc.close();

    }
}
