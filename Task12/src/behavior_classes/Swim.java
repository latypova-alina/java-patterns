package behavior_classes;

import interfaces.SwimBehavior;

/**
 * Created by alina on 09.03.17.
 */
public class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}
