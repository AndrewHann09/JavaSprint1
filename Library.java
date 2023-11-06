import java.util.List;
import java.util.ArrayList;

/**
 * Manages books, authors, and patrons in the library.
 */
public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    /**
     * Constructs a new library with empty lists of books, authors, and patrons.
     */
    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     *
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Adds an author to the library.
     *
     * @param author The author to be added.
     */
    public void addAuthor(Author author) {
        authors.add(author);
    }

    /**
     * Adds a patron to the library.
     *
     * @param patron The patron to be added.
     */
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    /**
     * Searches for books in the library by title, author, or ISBN.
     *
     * @param keyword The keyword to search for.
     * @return A list of books matching the search criteria.
     */
    public List<Book> searchBooks(String keyword) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().getName().contains(keyword) || book.getIsbn().contains(keyword)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    // Rest of the code...
}
