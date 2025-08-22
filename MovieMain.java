import java.util.Scanner;
class Movie {
    String title;
    String genre;
    double rating;
    Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;  }
    void displayDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");  } }
public class MovieMain {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
               System.out.print("Enter movie title: ");
        String title = sc.nextLine();
        System.out.print("Enter movie genre: ");
        String genre = sc.nextLine();
        System.out.print("Enter movie rating (out of 10): ");
        double rating = sc.nextDouble();
        Movie myMovie = new Movie(title, genre, rating);
        System.out.println("\n--- Movie Details ---");
        myMovie.displayDetails();

        sc.close();
    }
}
