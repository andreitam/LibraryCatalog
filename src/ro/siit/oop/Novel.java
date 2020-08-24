package ro.siit.oop;
/**
 * Class Novel inherits Book.
 * Novels have field typeNovel as enum type to restrict to this namings.
 * ROMANCE, SF, THRILLERS, FANTASY, HISTORICAL,MYSTERY
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-06
 */
public class Novel extends Book{
    public enum typeNovel {ROMANCE, SF, THRILLERS, FANTASY, HISTORICAL,MYSTERY }
    private typeNovel type;

    public Novel(String name, Integer pages, typeNovel type) {
        super(name, pages);
        this.type=type;
    }

    public typeNovel getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return super.toString()+" and is a novel of type "+type+".";
    }
}
