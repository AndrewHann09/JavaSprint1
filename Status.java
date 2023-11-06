/**
 * An enum representing the status of a book in the library.
 */
public enum Status {
    /**
     * The book is available and can be borrowed.
     */
    AVAILABLE,

    /**
     * The book is checked out by a patron.
     */
    CHECKED_OUT,

    /**
     * The book is overdue, indicating it should have been returned.
     */
    OVERDUE
}
