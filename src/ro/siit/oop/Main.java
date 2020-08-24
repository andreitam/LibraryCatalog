package ro.siit.oop;

public class Main
{
    public static void main(String[] args) throws Exception {
        LibraryCatalog catalog=new LibraryCatalog();
        BookFactory bf = new BookFactory();
        catalog.addBooks(bf.createBook("Crima si pedeapsa", 1000, Novel.typeNovel.HISTORICAL));
        catalog.addBooks(bf.createBook("Croatia vacanta", 100, Album.paperQuality.GOOD));
        catalog.addBooks(bf.createBook("Demonii", 1400, Novel.typeNovel.ROMANCE));
        catalog.addBooks(bf.createBook("Poze cu pescari", 30, Album.paperQuality.BAD));
        catalog.addBooks(bf.createBook("Acolo unde cântă racii", 200, Novel.typeNovel.MYSTERY));
        catalog.addBooks(bf.createBook("Adio, New Orleans", 30, Novel.typeNovel.ROMANCE));
        Novel novel = new Novel("xxx", 10, Novel.typeNovel.ROMANCE);
        catalog.addBooks(novel);
        catalog.printBooks();
        System.out.println(catalog.size());

        catalog.deleteBooks("Demonii");
        catalog.deleteBooks("Adio, New Orleans");
        catalog.deleteBooks(novel);
        catalog.printBooks();
        System.out.println(catalog.size());
    }
}

