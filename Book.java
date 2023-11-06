/**
 * Represents a book in the library.
 */
public class Book implements Borrowable {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numCopies;
    private int availableCopies;

    /**
     * Constructs a new Book instance.
     *
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param ISBN          The ISBN of the book.
     * @param publisher     The publisher of the book.
     * @param numCopies     The total number of copies available in the library.
     */
    public Book(String title, Author author, String ISBN, String publisher, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numCopies = numCopies;
        this.availableCopies = numCopies;
    }

    /**
     * Borrows a specified number of copies of this book.
     *
     * @param numCopies The number of copies to borrow.
     */
    @Override
    public void borrow(int numCopies) {
        if (availableCopies >= numCopies) {
            availableCopies -= numCopies;
            System.out.println(numCopies + " copies of '" + title + "' borrowed.");
        } else {
            System.out.println("Sorry, not enough copies available for '" + title + "'.");
        }
    }

    /**
     * Returns a specified number of copies of this book.
     *
     * @param numCopies The number of copies to return.
     */
    @Override
    public void returnBook(int numCopies) {
        availableCopies += numCopies;
        System.out.println(numCopies + " copies of '" + title + "' returned.");
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
    public String getISBN() {
        return ISBN;
    }
}
