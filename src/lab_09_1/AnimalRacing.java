package lab_09_1;

import java.security.SecureRandom;
import java.util.*;

public class AnimalRacing {
    public static void main(String[] args) {
        Animal panda = new Animal.Builder().setName("Panda").setSpeed(new SecureRandom().nextInt(70)).setWithWing(false).builder();
        Animal mouse = new Animal.Builder().setName("Mouse").setSpeed(new SecureRandom().nextInt(40)).setWithWing(false).builder();
        Animal horse = new Animal.Builder().setName("Horse").setSpeed(new SecureRandom().nextInt(100)).setWithWing(false).builder();
        Animal eagle = new Animal.Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(150)).setWithWing(true).builder();
        Animal sparrow = new Animal.Builder().setName("Sparrow").setSpeed(new SecureRandom().nextInt(170)).setWithWing(true).builder();

        List<Animal> animalsList = Arrays.asList(mouse, horse, panda, eagle, sparrow);
        AnimalRacing animalRacing = new AnimalRacing();
        animalRacing.getWinner(animalsList);
    }

    public static void getWinner(List<Animal> animalList) {
        Map<String, Integer> animalSpeedList = new HashMap<>();
        for (Animal animal : animalList) {
            if (animal.isWithWing() == false) {
                int animalSpeed = animal.getSpeed();
                String animalName = animal.getName();
                animalSpeedList.put(animalName, animalSpeed);
                System.out.println("Speed of " + animalName + " is " + animalSpeed);
            } else {
                String animalName = animal.getName();
                System.out.println(animalName +" do not participate in the race. Because it has wings!");
            }
        }
            int max = Collections.max(animalSpeedList.values());
            //Iterate each entry of hashmap
            for (Map.Entry<String, Integer> entry : animalSpeedList.entrySet()) {
                if (entry.getValue() == max) {
                    System.out.println("Winner is " + entry.getKey() + " with speed " + max);
                }
            }
        }
}

