import java.util.*;
class MovieTicket{
    String movieName;
    int people;
    String[] seatNumber;
    float price = 500.0f;

    public void book(int people){
        for(int i = 0;i<people;i++){
            seatNumber[i] = "A"+(i+1); 
        }
        price = price * people;
        System.out.println("your seat number is ");
        for(int i = 0;i<people;i++){
            System.out.print(seatNumber[i] + " ");
        }
        System.out.println("\ntotal price is " + price);
    }

    public void displayTicket(){
        System.out.println("Movie" + " "+ movieName);
        book(people);
    }

    public MovieTicket(String movieName, int people){
        this.movieName = movieName;
        this.people = people;
        seatNumber = new String[people];
    }
}


public class BookMovieTicket {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the movie name");
        String movieName = sc.next();
        System.out.print("enter the number of people");

        int people = sc.nextInt();
        MovieTicket m1 = new MovieTicket(movieName,people);
        m1.displayTicket();
        sc.close();
    }
}
