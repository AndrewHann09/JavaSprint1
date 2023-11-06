import java.util.List;

/**
 * This class is used to test the library management system and its features.
 */
public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        Author author1 = new Author("Author Name 1", "1990-01-01");
        Book book1 = new Book("Book Title 1", author1, "ISBN123", "Publisher 1", 5);

        // Use the getBooks() method to add the book to the author's list of books
        author1.getBooks().add(book1);
        library.addAuthor(author1);
        library.addBook(book1);

        Patron patron1 = new Patron("Patron 1", "123 Main St", "555-555-5555");
        library.addPatron(patron1);

        // Borrow a book
        System.out.println("Borrowing a book:");
        book1.borrow(patron1, 2);

        // Search for books
        System.out.println("Searching for books with 'Book Title':");
        List<Book> foundBooks = library.searchBooks("Book Title");
        for (Book book : foundBooks) {
            System.out.println("Found: " + book.getTitle());
        }

        // You can also search for books based on author's name or ISBN
        System.out.println("Searching for books with 'Author Name 1':");
        foundBooks = library.searchBooks("Author Name 1");
        for (Book book : foundBooks) {
            System.out.println("Found: " + book.getTitle());
        }

        System.out.println("Searching for books with 'ISBN123':");
        foundBooks = library.searchBooks("ISBN123");
        for (Book book : foundBooks) {
            System.out.println("Found: " + book.getTitle());
        }
    }
}
    