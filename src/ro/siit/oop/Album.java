package ro.siit.oop;
/**
 * Class Album inherits Book.
 * Albums have field paperQuality as enum type to restrict to this namings.
 * VERY_GOOD,GOOD,BAD
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-06
 */
public class Album extends Book{
    public enum paperQuality {VERY_GOOD,GOOD,BAD }
    private paperQuality paper;

    public Album(String name, Integer pages, paperQuality paper) {
        super(name, pages);
        this.paper=paper;
    }

    @Override
    public String toString() {
        return super.toString()+" and is an album of paper quality "+paper+".";
    }
}
