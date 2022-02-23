package lession08;

import java.util.List;

public class SpeedCalculator {
    public static int getTotalSpeed (List<Animal> animalList){
        int totalSpeed = 0;
        for (Animal item : animalList){
            totalSpeed = totalSpeed + item.getAnimalSpeed();
        }
        return totalSpeed;
    }
}
