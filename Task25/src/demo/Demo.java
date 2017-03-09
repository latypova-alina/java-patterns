package demo;

import colony.FlyWeightBacteria;

import java.util.ArrayList;

/**
 * Created by alina on 09.03.17.
 */
public class Demo {
    private final static int SIZE = 8_000_000;
    public static void main(String[] args) {
        ArrayList<FlyWeightBacteria> colony = new ArrayList<>();

        try {

            for (int i = 0; i < SIZE; i++) {
                colony.add(new FlyWeightBacteria("female"));
                colony.add(new FlyWeightBacteria("male"));
            }
        }catch (OutOfMemoryError e){
            System.err.println("Too much bacteria dude");
        } finally {
            System.out.println("Instance:" + colony.size());
        }
    }
}
