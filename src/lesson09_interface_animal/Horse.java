package lesson09_interface_animal;

import java.util.Random;

public class Horse extends Animal{
    private double speed;
    private static final int minSpeed = 15;
    private static final int maxSpeed = 24;

    Random random = new Random();

    @Override
    protected double speed() {
        return random.nextInt(maxSpeed + minSpeed) + minSpeed;
    }

    public Horse() {
        flyBehavior = new FlyNoway();
    }
}
