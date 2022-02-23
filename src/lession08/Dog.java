package lession08;

import java.security.SecureRandom;

public class Dog extends Animal{

    public Dog(String animalName, int animalSpeed) {
        super(animalName, animalSpeed);
    }

    @Override
    public int calculateSpeed(int speed) {
        return this.animalSpeed = new SecureRandom().nextInt(speed);
    }
}
