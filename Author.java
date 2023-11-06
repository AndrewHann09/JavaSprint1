    import java.util.List;
    import java.util.ArrayList;

    /**
     * Represents an author.
     */
    public class Author {
        private String name;
        private String dateOfBirth;
        private List<Book> books;

        /**
         * Constructs a new author with the specified attributes.
         *
         * @param name          The name of the author.
         * @param dateOfBirth   The date of birth of the author.
         */
        public Author(String name, String dateOfBirth) {
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.books = new ArrayList<>();
        }

        /**
         * Gets the name of the author.
         *
         * @return The name of the author.
         */
        public String getName() {
            return name;
        }

        /**
         * Gets the list of books written by the author.
         *
         * @return The list of books written by the author.
         */
        public List<Book> getBooks() {
            return books;
        }

        // Other methods and attributes...
    }
