package classes;

import interfaces.Memento;

import java.util.HashMap;

/**
 * Created by alina on 10.03.17.
 */
public class RequestRunner {
    public static void main(String[] args) {
        HashMap<String, String> p = new HashMap<String, String>(){
            {
                this.put("[1, 1]", "X");
            }
        };
        RequestParameter r = new RequestParameter(p);
        System.out.println("Первый ход игрока" + " " + r.getParams());
        Memento memento = r.getMemento();
        CareTaker careTaker = new CareTaker(memento);
        r.addParam("[1, 1]", "O");
        System.out.println("Второй ход игрока" + " " + r.getParams());
        memento = careTaker.getMemento();
        r.setMemento(memento);
        System.out.println("Отменить ход" + " " + r.getParams());
    }
}
