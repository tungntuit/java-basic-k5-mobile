package lession08;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger(String animalName, int animalSpeed) {
        super(animalName, animalSpeed);
    }

    @Override
    public int calculateSpeed(int speed) {
        return this.animalSpeed = new SecureRandom().nextInt(speed);
    }
}
