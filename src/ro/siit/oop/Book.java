package ro.siit.oop;
/**
 * Class Book have field names and pages.
 * Class Book will be inherited by Novel, Albums etc.
 * Class Book declared abstract so it cannot be instaniated.
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-06
 */
public abstract class Book {
    private String name;
    private Integer pages;

    public Book(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "This book "+this.name+" has "+this.pages+" pages" ;
    }
}
