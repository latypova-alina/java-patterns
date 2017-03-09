package race_classes;

import behavior_classes.Walk;
import interfaces.ICreature;

/**
 * Created by alina on 09.03.17.
 */
public class Elf implements ICreature {

    Walk walk;

    public Elf(){
        walk = new Walk();
    }

    @Override
    public void move() {
        walk.walk();
    }
}
