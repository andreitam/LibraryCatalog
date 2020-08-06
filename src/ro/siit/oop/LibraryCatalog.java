package ro.siit.oop;

import java.util.ArrayList;

/**
 * Class LibraryCatalog contains methods
 * addBooks(Book book), deleteBooks(Book book), listBooks().
 * Field "books" is an array list used to collect the books in the catalog.
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-06
 */
public class LibraryCatalog {
    private ArrayList<Book> books = new ArrayList<>();
    /**
     * Method for adding books to the catalog
     *
     * @param book to be added to the ArrayList
     */
    public void addBooks(Book book) {
        books.add(book);
    }
    /**
     * Method for deleting books from the catalog
     *
     * @param book to be removed from the ArrayList
     */
    public void deleteBooks(Book book) {
        books.remove(book);
    }
    /**
     * Method for listing the books from the catalog
     *
     */
    public void listBooks() {
        for(Book book : books)
            System.out.println(book);
    }

}
