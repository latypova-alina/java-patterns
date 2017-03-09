package factories;

import classes.XMLReader;
import interfaces.Reader;
import interfaces.Writer;

/**
 * Created by alina on 08.03.17.
 */
public abstract class AbstractFactory {
    public abstract Writer createWriter();
    public abstract Reader createReader();

}
