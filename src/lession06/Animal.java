package lession06;
import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String animalName;

    public Animal() {
    }

    public Animal(int speed, String animalName) {
        this.speed = speed;
        this.animalName = animalName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
