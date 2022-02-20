package lession06;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    public static void main(String[] args) {
        Animal winner;
        List<Animal> listAnimal = new ArrayList<>();

        SecureRandom secureRandom = new SecureRandom();
        int randomHorseSpeed = secureRandom.nextInt(75);
        int randomTigerSpeed = secureRandom.nextInt(100);
        int randomDogSpeed = secureRandom.nextInt(60);

        Animal horse = new Animal(randomHorseSpeed, "Horse");
        Animal tiger = new Animal(randomTigerSpeed, "Tiger");
        Animal dog = new Animal(randomDogSpeed, "Dog");

        for (Animal item : new Animal[]{horse, tiger, dog}) {
            listAnimal.add(item);
        }

        winner = listAnimal.get(0);

        for (int i = 0; i < listAnimal.size(); i++) {
            if (listAnimal.get(i).getSpeed() > winner.getSpeed()) {
                winner = listAnimal.get(i);
            }
        }
        System.out.println("The winner is: " + winner.getAnimalName() + ", with speed: " + winner.getSpeed());
    }
}
