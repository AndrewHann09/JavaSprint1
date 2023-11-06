/**
 * An interface for borrowable items.
 */
public interface Borrowable {
    /**
     * Borrows a specified number of items.
     *
     * @param numCopies The number of items to borrow.
     */
    void borrow(int numCopies);

    /**
     * Returns a specified number of items.
     *
     * @param numCopies The number of items to return.
     */
    void returnBook(int numCopies);
}
