class Movie {
    String title;
    int[] ratings; 
    Movie(String title, int[] ratings) {
        this.title = title;
        this.ratings = ratings;
    }
    double getAverageRating() {
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.length;
    }
}
public class MovieM {
    public static void main(String[] args) {
        // Store 4 movies
        Movie[] movies = new Movie[4];
        movies[0] = new Movie("	Chennai Expess", new int[]{5, 4, 5, 5, 4});
        movies[1] = new Movie("Jab We Met", new int[]{5, 5, 5, 5, 5});
        movies[2] = new Movie("Secret Superstar", new int[]{4, 5, 5, 4, 5});
        movies[3] = new Movie("3Idiots", new int[]{4, 4, 4, 5, 4});
        Movie bestMovie = movies[0];
        for (int i = 1; i < movies.length; i++) {
            if (movies[i].getAverageRating() > bestMovie.getAverageRating()) {
                bestMovie = movies[i];
            }
        }
        System.out.println("Movie with the best average rating:");
        System.out.println("Title: " + bestMovie.title);
        System.out.println("Average Rating: " + bestMovie.getAverageRating());
    }
}
