import java.util.ArrayList;
import java.util.List;

/**
 * Represents an author of books.
 */
public class Author {
    private String name;
    private String dateOfBirth;
    private List<Book> booksWritten;

    /**
     * Constructs a new Author instance.
     *
     * @param name        The name of the author.
     * @param dateOfBirth  The date of birth of the author.
     */
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.booksWritten = new ArrayList<>();
    }

    /**
     * Adds a book to the list of books written by this author.
     *
     * @param book The book to be added to the author's list.
     */
    public void addBook(Book book) {
        booksWritten.add(book);
    }

    /**
     * Gets the name of the author.
     *
     * @return The name of the author.
     */
    public String getName() {
        return name;
    }
}
