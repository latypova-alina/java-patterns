package classes;

import DAO.CallDAO;
import interfaces.Writer;

/**
 * Created by alina on 09.03.17.
 */
public class DBWriter implements Writer {

    CallDAO callDAO;

    public DBWriter(){
        callDAO = new CallDAO();
    }

    @Override
    public void write(Call call) {
        callDAO.add(call);
    }
}
