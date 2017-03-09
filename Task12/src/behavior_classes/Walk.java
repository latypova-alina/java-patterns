package behavior_classes;

import interfaces.WalkBehavior;

/**
 * Created by alina on 09.03.17.
 */
public class Walk implements WalkBehavior {
    @Override
    public void walk() {
        System.out.println("I can walk!");
    }
}
