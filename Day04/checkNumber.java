import java.util.Scanner;
public class checkNumber {
    public static void main(String[] arge)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        if(number > 0)
        {
            System.out.println("Positive Number");
        }
        else if(number < 0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Number is Zero");
        }
        sc.close();
    }
}
