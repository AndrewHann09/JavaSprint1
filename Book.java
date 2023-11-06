import java.util.Map;
import java.util.HashMap;

/**
 * Represents a book in the library.
 */
public class Book implements Borrowable {
    private String title;
    private Author author;
    private String isbn;
    private String publisher;
    private int totalCopies;
    private int availableCopies;
    private Status status;
    private Map<Patron, Integer> borrowers;

    /**
     * Constructs a new book.
     *
     * @param title       The title of the book.
     * @param author      The author of the book.
     * @param isbn        The ISBN of the book.
     * @param publisher   The publisher of the book.
     * @param totalCopies The total number of copies available.
     */
    public Book(String title, Author author, String isbn, String publisher, int totalCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
        this.status = Status.AVAILABLE;
        this.borrowers = new HashMap<>();
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Borrow a specific quantity of this book to a patron.
     *
     * @param patron   The patron borrowing the book.
     * @param quantity The quantity of copies to borrow.
     * @return True if the book is successfully borrowed, false otherwise.
     */
    @Override
    public boolean borrow(Patron patron, int quantity) {
        if (status == Status.AVAILABLE && availableCopies >= quantity) {
            availableCopies -= quantity;
            borrowers.put(patron, quantity);
            status = Status.CHECKED_OUT;
            patron.borrowBook(this, quantity);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Return a specific quantity of this book by a patron.
     *
     * @param patron   The patron returning the book.
     * @param quantity The quantity of copies to return.
     * @return True if the book is successfully returned, false otherwise.
     */
    @Override
    public boolean returnBook(Patron patron, int quantity) {
        if (borrowers.containsKey(patron)) {
            int currentBorrowed = borrowers.get(patron);
            if (currentBorrowed >= quantity) {
                borrowers.put(patron, currentBorrowed - quantity);
                availableCopies += quantity;
                if (currentBorrowed - quantity == 0) {
                    borrowers.remove(patron);
                    status = Status.AVAILABLE;
                }
                patron.returnBook(this, quantity);
                return true;
            }
        }
        return false;
    }

    // Rest of the code...
}
