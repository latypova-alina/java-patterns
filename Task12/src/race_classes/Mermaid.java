package race_classes;

import behavior_classes.Swim;
import interfaces.ICreature;

/**
 * Created by alina on 09.03.17.
 */
public class Mermaid implements ICreature {

    Swim swim;

    public Mermaid(){
        swim = new Swim();
    }

    @Override
    public void move() {
        swim.swim();
    }
}
