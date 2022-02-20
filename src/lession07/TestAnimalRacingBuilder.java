package lession07;

import lession06.Animal;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestAnimalRacingBuilder {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int randomHorseSpeed = secureRandom.nextInt(75);
        int randomTigerSpeed = secureRandom.nextInt(100);
        int randomDogSpeed = secureRandom.nextInt(60);
        int randomFalconSpeed = secureRandom.nextInt(150);
        int randomEagleSpeed = secureRandom.nextInt(200);
        boolean isFlyable = true;
        List<AnimalRacingBuilder> listAnimal = new ArrayList<>();
        List<AnimalRacingBuilder> listAnimalWithSpeed = new ArrayList<>();
        AnimalRacingBuilder.Builder builder = new AnimalRacingBuilder.Builder();
        AnimalRacingBuilder Horse =
                builder
                        .withAnimalName("Horse")
                        .withSpeed(randomHorseSpeed)
                        .withFlyable(!isFlyable)
                        .build();

        AnimalRacingBuilder Tiger =
                builder
                        .withAnimalName("Tiger")
                        .withSpeed(randomTigerSpeed)
                        .withFlyable(!isFlyable)
                        .build();

        AnimalRacingBuilder Dog =builder
                        .withAnimalName("Dog")
                        .withSpeed(randomDogSpeed)
                        .withFlyable(!isFlyable)
                        .build();

        AnimalRacingBuilder Falcon  =builder
                        .withAnimalName("Falcon")
                        .withSpeed(randomFalconSpeed)
                        .withFlyable(isFlyable)
                        .build();

        AnimalRacingBuilder Eagle =builder
                        .withAnimalName("Eagle")
                        .withSpeed(randomEagleSpeed)
                        .withFlyable(isFlyable)
                        .build();


        for (AnimalRacingBuilder item : new AnimalRacingBuilder[]{Horse, Tiger, Dog, Falcon, Eagle}) {
            listAnimal.add(item);
        }

        for (int i = 0; i < listAnimal.size(); i++) {
            if (listAnimal.get(i).isFlyable() == false){
                listAnimalWithSpeed.add(builder
                        .withAnimalName(listAnimal.get(i).getAnimalName())
                        .withSpeed(listAnimal.get(i).getSpeed())
                        .build()
                );
            }
            else if (listAnimal.get(i).isFlyable() == true){
                System.out.println(listAnimal.get(i).getAnimalName() + " can't join the game");

            }
        }
        AnimalRacingBuilder winner = listAnimalWithSpeed.get(0);

        for (int i = 0; i < listAnimalWithSpeed.size(); i++) {
            if(listAnimalWithSpeed.get(i).getSpeed()>winner.getSpeed()) {
                winner = listAnimalWithSpeed.get(i);
            }
        }
        System.out.println("The winner is: " + winner.getAnimalName() + " and speed is: " + winner.getSpeed());
    }
}
