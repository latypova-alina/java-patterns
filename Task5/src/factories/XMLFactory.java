package factories;

import classes.XMLReader;
import interfaces.Reader;
import interfaces.Writer;
import classes.XMLFile;

/**
 * Created by alina on 08.03.17.
 */
public class XMLFactory extends AbstractFactory {
    @Override
    public Writer createWriter() {
        return new XMLFile();
    }

    @Override
    public Reader createReader() {
        return new XMLReader();
    }
}
