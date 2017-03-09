package race_classes;

import behavior_classes.FlyWithMagic;
import behavior_classes.Walk;
import interfaces.ICreature;

/**
 * Created by alina on 09.03.17.
 */
public class Wizard implements ICreature {

    Walk walk;
    FlyWithMagic flyWithMagic;

    public Wizard(){
        walk = new Walk();
        flyWithMagic = new FlyWithMagic();
    }

    @Override
    public void move() {
        walk.walk();
        flyWithMagic.fly();
    }
}
