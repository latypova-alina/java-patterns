package classes;

/**
 * Created by alina on 10.03.17.
 */
public class Call {
    private String sender;
    private String receiver;


    public Call(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

}
