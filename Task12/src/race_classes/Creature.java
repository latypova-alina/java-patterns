package race_classes;

import interfaces.ICreature;

/**
 * Created by alina on 09.03.17.
 */
public class Creature {
    private ICreature creature;

    public Creature(ICreature creature){
        this.creature = creature;
    }

    public void move(){
        creature.move();
    }

}
