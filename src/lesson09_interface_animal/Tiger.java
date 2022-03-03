package lesson09_interface_animal;
import java.security.SecureRandom;
import java.util.Random;

public class Tiger extends Animal{
    private double speed;
    private static final double factor = 0.06;
    private static final int minWeight = 250;
    private static final int maxWeight = 400;

    Random random = new Random();

    @Override
    protected double speed() {
        return (random.nextInt(maxWeight + minWeight) + minWeight)*factor;
    }

    public Tiger() {
        flyBehavior = new FlyNoway();
    }
}
