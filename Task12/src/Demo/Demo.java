package Demo;

import race_classes.Creature;
import race_classes.Elf;
import race_classes.Mermaid;
import race_classes.Wizard;

/**
 * Created by alina on 09.03.17.
 */
public class Demo {
    public static void main(String[] args) {
        Creature elf = new Creature(new Elf());
        elf.move();
        Creature wizard = new Creature(new Wizard());
        wizard.move();
        Creature mermaid = new Creature(new Mermaid());
        mermaid.move();
    }
}
