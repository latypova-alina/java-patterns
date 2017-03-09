package factories;

import classes.DBReader;
import classes.DBWriter;
import classes.XMLReader;
import interfaces.Reader;
import interfaces.Writer;

/**
 * Created by alina on 08.03.17.
 */
public class DAOFactory extends AbstractFactory {
    @Override
    public Writer createWriter() {
        return new DBWriter();
    }

    @Override
    public Reader createReader() {
        return new DBReader();
    }
}
