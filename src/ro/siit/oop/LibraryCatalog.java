package ro.siit.oop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class LibraryCatalog contains methods
 * addBooks(Book book), deleteBooks(Book book), listBooks().
 * Field "books" is an array list used to collect the books in the catalog.
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-06
 */
public class LibraryCatalog implements Iterable<Book> {
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
     * delete Book object
     *
     * @param book to be removed from the ArrayList
     */
    public void deleteBooks(Book book) {
        books.remove(book);
    }
    /**
     * Method for deleting books from the catalog
     * delete Book object depending on title
     * will throw ConcurrentModificationException
     *
     * @param name String to search book name
     */
    public void deleteBooks(String name) throws Exception {
        try {
            for (Book book : books) {
                if (book.getName().equals(name)) {
                    books.remove(book);
                }
            }
        }
        catch (Exception e) {
        }
    }
    /**
     * Method for listing the books from the catalog
     *
     */
    public void printBooks() {
        for(Book book : books)
            System.out.println(book);
    }
    /**
     * Method for getting the size of the list
     *
     */
    public int size() {
        int size=0;
        for(int i = 0; i <= books.size(); ++i) { size=i; }
        return size;
    }
    /**
     * Method for clearing the list
     *
     */
    public void clear() {
        books.clear();
    }
    /**
     * Method for returning the list iterator
     *
     */
    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
