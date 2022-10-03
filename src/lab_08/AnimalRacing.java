package lab_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalRacing {
    public static void racing(Bear bear, Horse horse, Panda panda){
        int bearSpeed = bear.getSpeed();
        int horseSpeed = horse.getSpeed();
        int pandaSpeed = panda.getSpeed();

        System.out.println("Speed of " + bear.getAnimalName() + " is " + bearSpeed);
        System.out.println("Speed of " + horse.getAnimalName() + " is " + horseSpeed);
        System.out.println("Speed of " + panda.getAnimalName() + " is " + pandaSpeed);

        List<Integer> animalSpeed = new ArrayList<>();
        animalSpeed.add(bearSpeed);
        animalSpeed.add(horseSpeed);
        animalSpeed.add(pandaSpeed);
        int max = Collections.max(animalSpeed);
        if (bearSpeed == max) {
            System.out.println("Winner is: " + bear.getAnimalName() + " with speed " + bearSpeed);
        } else if (horseSpeed == max) {
            System.out.println("Winner is: " + horse.getAnimalName() + " with speed " + horseSpeed);
        } else {
            System.out.println("Winner is: " + panda.getAnimalName() + " with speed " + pandaSpeed);
        }
    }

    public static void main(String[] args) {
        Bear bear = new Bear();
        Horse horse = new Horse();
        Panda panda = new Panda();
        racing(bear, horse, panda);
    }
}

