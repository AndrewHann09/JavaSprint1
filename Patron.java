import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library patron who can borrow and return books.
 */
public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    /**
     * Constructs a new Patron instance.
     *
     * @param name        The name of the patron.
     * @param address     The address of the patron.
     * @param phoneNumber The phone number of the patron.
     */
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    /**
     * Borrows a book from the library and adds it to the list of borrowed books.
     *
     * @param book      The book to be borrowed.
     * @param numCopies The number of copies to borrow.
     */
    public void borrowBook(Book book, int numCopies) {
        book.borrow(numCopies);
        borrowedBooks.add(book);
    }

    /**
     * Returns a book to the library and removes it from the list of borrowed books.
     *
     * @param book      The book to be returned.
     * @param numCopies The number of copies to return.
     */
    public void returnBook(Book book, int numCopies) {
        book.returnBook(numCopies);
        borrowedBooks.remove(book);
    }

    /**
     * Gets the name of the patron.
     *
     * @return The name of the patron.
     */
    public String getName() {
        return name;
    }
}
