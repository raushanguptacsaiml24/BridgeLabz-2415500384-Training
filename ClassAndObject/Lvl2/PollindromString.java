import java.util.*;
class PollindromChecker{
    String text;

    public void check(){
        String reverse = "";
        for(int i = text.length()-1;i>=0;i--){
            reverse = reverse + text.charAt(i);
        }

        if(text.equals(reverse)){
            System.out.print("text is pollindrom");
        }
        else{
            System.out.print("text is not pollindrom");
        }
    }

    PollindromChecker(String text){
        this.text = text;
    }
}




public class PollindromString {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the text");
        String text = sc.next();
        PollindromChecker p1 = new PollindromChecker(text);
        p1.check();
        sc.close();
    }
}
