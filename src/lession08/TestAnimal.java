package lession08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        Animal winner;
        List<Animal> listAnimal = new ArrayList<>();

        SecureRandom secureRandom = new SecureRandom();
        int randomHorseSpeed = secureRandom.nextInt(75);
        int randomTigerSpeed = secureRandom.nextInt(100);
        int randomDogSpeed = secureRandom.nextInt(60);

        Horse horse = new Horse("Horse",randomHorseSpeed);
        Tiger tiger = new Tiger("Tiger", randomTigerSpeed);
        Dog dog = new Dog("Dog",randomDogSpeed);

        for (Animal item : new Animal[]{horse, tiger, dog}) {
            listAnimal.add(item);
        }

        winner = listAnimal.get(0);

        for (int i = 0; i < listAnimal.size(); i++) {
            if (listAnimal.get(i).getAnimalSpeed() > winner.getAnimalSpeed()) {
                winner = listAnimal.get(i);
            }
        }
        System.out.println("The winner is: " + winner.getAnimalName() + ", with speed: " + winner.getAnimalSpeed());

        System.out.println(SpeedCalculator.getTotalSpeed(listAnimal));
    }
}