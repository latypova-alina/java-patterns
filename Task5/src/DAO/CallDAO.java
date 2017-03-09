package DAO;

import classes.Call;
import factories.AbstractFactory;
import interfaces.Reader;
import interfaces.Writer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static DB.DBConnection.getDBConnection;

/**
 * Created by alina on 08.03.17.
 */
public class CallDAO {

    public Call getById(int id){
        Connection connection = null;
        try {
            connection = getDBConnection();
            assert connection != null;
            PreparedStatement pstmt = connection.prepareStatement("SELECT sender, receiver FROM callings WHERE id = ?;");
            pstmt.setString(1, String.valueOf(id));
            ResultSet set = pstmt.executeQuery();
            if (set.next()) {
                String sender = set.getString(1);
                String receiver = set.getString(2);
                return new Call(sender, receiver);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void add(Call call) {
        try {
            Connection connection = (Connection) getDBConnection();
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement("INSERT INTO callings(Sender, Reciever) VALUES (?,?)");
            pstmt.setString(1, call.getSender());
            pstmt.setString(2, call.getReceiver());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
