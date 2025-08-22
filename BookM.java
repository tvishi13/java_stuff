class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
public class BookM{
    // Method to print books by a given author
    static void printBooksByAuthor(Book[] books, String searchAuthor) {
        boolean found = false;
        System.out.println("Books written by " + searchAuthor + ":");
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(searchAuthor)) {
                System.out.println("- " + book.title);
              found = true;   }
        }
        if (!found) {
            System.out.println("No books found for this author.");
        }
    }
    public static void main(String[] args) {
        // Array of 5 books
        Book[] library = new Book[5];
        library[0] = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        library[1] = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling");
        library[2] = new Book("The Hobbit", "J.R.R. Tolkien");
        library[3] = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        library[4] = new Book("The Da Vinci Code", "Dan Brown");
        printBooksByAuthor(library, "J.K. Rowling");
    }
}
