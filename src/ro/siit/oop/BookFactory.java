package ro.siit.oop;
/**
 * Class BookFactory to get instances of Album or Novel
 * depending of the createBook() arguments
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-06
 */
public class BookFactory {
    Book book;
    /**
     * Overloaded
     * Method creating new Album() instance
     *
     * @param name book name
     * @param pages book number of pages
     * @param paper paper quality which determines it is a Album
     * @return Album
     */
    public Book createBook(String name, Integer pages, Album.paperQuality paper) {
        book = new Album(name, pages, paper);
        return book;
    }
    /**
     * Overloaded
     * Method creating new Album() instance
     *
     * @param name book name
     * @param pages book number of pages
     * @param type Novel type which determines it is a Novel
     * @return Novel
     */
    public Book createBook(String name, Integer pages, Novel.typeNovel type) {
        book = new Novel(name, pages, type);
        return book;
    }
}
