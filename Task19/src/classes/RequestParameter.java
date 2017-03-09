package classes;

import interfaces.Memento;

import java.util.HashMap;

/**
 * Created by alina on 10.03.17.
 */
public class RequestParameter {
    private HashMap<String, String> param = new HashMap<String, String>();

    public RequestParameter(HashMap<String, String> param){
        this.param = param;
    }

    public Memento getMemento() {
        HashMap<String, String> state = (HashMap<String, String>)(param.clone());
        return new RequestParameterMemento(state);
    }

    public void setMemento(Memento object){
        if (object instanceof RequestParameterMemento){
            RequestParameterMemento memento = (RequestParameterMemento)object;
            param = memento.state;
        }
    }

    private class RequestParameterMemento implements Memento{
        private HashMap<String, String> state;

        RequestParameterMemento(HashMap<String, String> state){
            this.state = state;
        }
    }

    public void addParam(String key, String value){
        param.put(key, value);
    }

    public HashMap<String, String> getParams(){
        return param;
    }
    
}
