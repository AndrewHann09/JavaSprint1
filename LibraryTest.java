import java.util.List;
/**
 * A test class for the Library management system.
 */
public class LibraryTest {
    /**
     * The main method to test the Library management system.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create some authors
        Author author1 = new Author("Author 1", "1990-01-15");
        Author author2 = new Author("Author 2", "1985-07-22");

        // Create some books
        Book book1 = new Book("Book 1", author1, "ISBN-12345", "Publisher A", 5);
        Book book2 = new Book("Book 2", author1, "ISBN-67890", "Publisher B", 3);
        Book book3 = new Book("Book 3", author2, "ISBN-54321", "Publisher A", 7);

        // Create a library
        Library library = new Library();

        // Add books and authors to the library
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create some patrons
        Patron patron1 = new Patron("Patron 1", "Address 1", "123-456-7890");
        Patron patron2 = new Patron("Patron 2", "Address 2", "987-654-3210");

        // Add patrons to the library
        library.addPatron(patron1);
        library.addPatron(patron2);

        // Test borrowing and returning books
        patron1.borrowBook(book1, 2);
        patron1.borrowBook(book3, 1);

        patron2.borrowBook(book2, 2);

        patron1.returnBook(book1, 1);
        patron2.returnBook(book2, 1);

        // Search for books by title and display the results
        List<Book> booksByTitle = library.searchByTitle("Book 1");
        System.out.println("Books with title 'Book 1':");
        for (Book book : booksByTitle) {
            System.out.println(book.getTitle());
        }

        // Search for books by author and display the results
        List<Book> booksByAuthor = library.searchByAuthor(author1);
        System.out.println("Books by 'Author 1':");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        // Search for a book by ISBN and display the result
        Book bookByISBN = library.searchByISBN("ISBN-67890");
        System.out.println("Book with ISBN 'ISBN-67890':");
        if (bookByISBN != null) {
            System.out.println(bookByISBN.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}
