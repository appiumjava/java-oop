package lab_08;

import java.util.*;

public class AnimalRacing {
    public static void racing(List<Animals> animalsList) {
        Map<String, Integer> animalSpeedList = new HashMap<>();
        for (Animals animals : animalsList) {
            int animalSpeed = animals.getSpeed();
            String animalName = animals.getAnimalName();
            animalSpeedList.put(animalName, animalSpeed);
            System.out.println("Speed of " + animalName + " is " + animalSpeed);
        }
        int max = Collections.max(animalSpeedList.values());
        //Iterate each entry of hashmap
        for (Map.Entry<String, Integer> entry : animalSpeedList.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("Winner is " + entry.getKey() + " with speed " + max);
            }
        }
    }

    public static void main(String[] args) {
        Bear bear = new Bear("Bear");
        Horse horse = new Horse("Horse");
        Panda panda = new Panda("Panda");

        List<Animals> animalsList = Arrays.asList(bear, horse, panda);
        AnimalRacing animalRacing = new AnimalRacing();
        animalRacing.racing(animalsList);
    }
}


