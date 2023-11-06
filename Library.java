import java.util.ArrayList;
import java.util.List;

/**
 * Manages books, authors, and patrons in a library.
 */
public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    /**
     * Constructs a new Library instance.
     */
    public Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    /**
     * Add a book to the library.
     *
     * @param book The book to be added to the library.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Add an author to the library.
     *
     * @param author The author to be added to the library.
     */
    public void addAuthor(Author author) {
        authors.add(author);
    }

    /**
     * Add a patron to the library.
     *
     * @param patron The patron to be added to the library.
     */
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    /**
     * Search for books in the library by title.
     *
     * @param title The title of the book to search for.
     * @return A list of books with the specified title.
     */
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

/**
 * Search for books in the library by author.
 *
 * @param author The author to search for.
 * @return A list of books written by the specified author.
 */
public List<Book> searchByAuthor(Author author) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
        if (book.getAuthor().equals(author)) {
            result.add(book);
        }
    }
    return result;
}

/**
 * Search for a book in the library by ISBN.
 *
 * @param ISBN The ISBN of the book to search for.
 * @return The book with the specified ISBN, or null if not found.
 */
public Book searchByISBN(String ISBN) {
    for (Book book : books) {
        if (book.getISBN().equals(ISBN)) {
            return book;
        }
    }
    return null; // Return null if the book with the specified ISBN is not found.
}

}

