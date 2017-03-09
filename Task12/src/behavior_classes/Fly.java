package behavior_classes;

import interfaces.FlyBehavior;

/**
 * Created by alina on 09.03.17.
 */
public class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
