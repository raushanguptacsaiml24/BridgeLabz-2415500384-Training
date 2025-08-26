import java.util.Scanner;
public class VoteEligible {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("You can Vote");
        }
        else
        {
            System.out.println("You cannot Vote");
        }
        sc.close();
    }
    
}
