package classes;

import interfaces.Memento;

/**
 * Created by alina on 10.03.17.
 */
public class CareTaker {

    private Memento memento;

    public CareTaker(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
