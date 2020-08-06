package ro.siit.oop;
/**
 * Create a small application that mimics a library catalog.
 * It needs to be able to add books, delete books and list books.
 * Books are of two kinds: novels and art albums.
 * They both have names and number of pages.
 * Novels have type (like mystery, sf, etc.) while albums have paper quality.
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-06
 */
public class Main {
    public static void main(String[] args) {
//        Book c1=new Book("carte junglei",400);
        Novel c2=new Novel("-Crima si pedeapsa-", 1000, Novel.typeNovel.HISTORICAL);
        Album c3=new Album("-Croatia vacanta-", 100, Album.paperQuality.GOOD);
        Novel c4=new Novel("-Demonii-", 1400, Novel.typeNovel.ROMANCE);
        Album c5=new Album("-Poze cu pescari-", 30, Album.paperQuality.BAD);
        //
        LibraryCatalog catalog=new LibraryCatalog();
        catalog.addBooks(c4);
        catalog.addBooks(c2);
        catalog.addBooks(c5);
        catalog.addBooks(c3);
        catalog.deleteBooks(c2);
        catalog.listBooks();

    }
}
