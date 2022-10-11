package lab_10;

import java.util.*;

public class AnimalRacing {
    public static void racing(List<Animals> animalsList) {
        Map<String, Integer> animalSpeedList = new HashMap<>();
        for (Animals animals : animalsList) {
            String animalName = animals.getAnimalName();
            animalSpeedList.put(animalName, animals.getSpeed());
            System.out.println("Speed of " + animalName + " is " + animals.getSpeed());
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
        Cat cat = new Cat();
        Mouse mouse = new Mouse();
        Dog dog = new Dog();

        List<Animals> animalsList = Arrays.asList(cat, mouse, dog);
        AnimalRacing animalRacing = new AnimalRacing();
        animalRacing.racing(animalsList);
    }
}


