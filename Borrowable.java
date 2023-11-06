/**
 * A Borrowable interface represents items that can be borrowed and returned, such as books.
 */
public interface Borrowable {
    /**
     * Borrow a specific quantity of this item to a patron.
     *
     * @param patron   The patron borrowing the item.
     * @param quantity The quantity of items to borrow.
     * @return True if the item is successfully borrowed, false otherwise.
     */
    boolean borrow(Patron patron, int quantity);

    /**
     * Return a specific quantity of this item by a patron.
     *
     * @param patron   The patron returning the item.
     * @param quantity The quantity of items to return.
     * @return True if the item is successfully returned, false otherwise.
     */
    boolean returnBook(Patron patron, int quantity);
}
