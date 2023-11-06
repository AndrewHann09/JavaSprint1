import java.util.HashMap;
import java.util.Map;

/**
 * Represents a patron who can borrow and return books from the library.
 */
public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private Map<Book, Integer> borrowedBooks;

    /**
     * Constructs a new patron.
     *
     * @param name        The name of the patron.
     * @param address     The address of the patron.
     * @param phoneNumber The phone number of the patron.
     */
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new HashMap<>();
    }

    /**
     * Gets the name of the patron.
     *
     * @return The name of the patron.
     */
    public String getName() {
        return name;
    }

    /**
     * Borrow a specific quantity of a book by the patron.
     *
     * @param book     The book to be borrowed.
     * @param quantity The quantity of copies to borrow.
     */
    public void borrowBook(Book book, int quantity) {
        if (borrowedBooks.containsKey(book)) {
            borrowedBooks.put(book, borrowedBooks.get(book) + quantity);
        } else {
            borrowedBooks.put(book, quantity);
        }
    }

    /**
     * Return a specific quantity of a book by the patron.
     *
     * @param book     The book to be returned.
     * @param quantity The quantity of copies to return.
     */
    public void returnBook(Book book, int quantity) {
        if (borrowedBooks.containsKey(book)) {
            int currentBorrowed = borrowedBooks.get(book);
            if (currentBorrowed >= quantity) {
                borrowedBooks.put(book, currentBorrowed - quantity);
                if (currentBorrowed - quantity == 0) {
                    borrowedBooks.remove(book);
                }
            }
        }
    }
}
