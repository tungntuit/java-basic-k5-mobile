package lesson09_interface_animal;

import java.util.Random;

public class Elephant extends Animal{
    private double speed;
    private static final int factor = 6;
    private static final int minStep = 3;
    private static final int maxStep = 4;

    Random random = new Random();

    @Override
    protected double speed() {
        return (random.nextInt(minStep + maxStep) + minStep)*factor;
    }

    public Elephant() {
        flyBehavior = new FlyNoway();
    }
}
