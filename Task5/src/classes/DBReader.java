package classes;

import DAO.CallDAO;
import interfaces.Reader;
import interfaces.Writer;

/**
 * Created by alina on 08.03.17.
 */
public class DBReader implements Reader {

    CallDAO callDAO;

    public DBReader(){
        callDAO = new CallDAO();
    }

    @Override
    public void read(int id) {
        callDAO.getById(id);

    }
}
