package lesson09_interface_animal;

import java.util.Random;

public class Falcon extends Animal{
    private double speed;
    private static final int minSpeed = 20;
    private static final int maxSpeed = 40;

    Random random = new Random();

    @Override
    protected double speed() {
        return random.nextInt(maxSpeed + minSpeed) + minSpeed;
    }

    public Falcon() {
        flyBehavior = new FlyWithWings();
    }
}
