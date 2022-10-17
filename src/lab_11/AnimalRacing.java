package lab_11;

import java.util.*;

public class AnimalRacing {

    public static List<MoveAble> filterWing(List<FlyAble> flyAbleObjects) {
        List<MoveAble> animalWithoutWing = new ArrayList<>();
        for (FlyAble flyAbleObject : flyAbleObjects) {
            if (flyAbleObject.withWing() == false) {
                animalWithoutWing.add((MoveAble) flyAbleObject);
            } else {
                System.out.println(flyAbleObject.getClass().getSimpleName() + " do not participate in the race. Because it has wings!");
            }
        }
        return animalWithoutWing;
    }

    public static void printWinner(List<FlyAble> flyAbleObjects) {
        Map<String, Integer> animalSpeedList = new HashMap<>();
        for (MoveAble moveAbleObjects : AnimalRacing.filterWing(flyAbleObjects)) {
            animalSpeedList.put(moveAbleObjects.getClass().getSimpleName(), moveAbleObjects.speed());
            System.out.println("Speed of " + moveAbleObjects.getClass().getSimpleName() + " is " + moveAbleObjects.speed());
        }
        int count = 0;
        for (int i = 0; i < animalSpeedList.size(); i++) {
            count++;
        }
        if (animalSpeedList.isEmpty()) {
            System.out.println("No animals entered the race.");
        } else if (count == 1) {
            System.out.println("Winner is " + animalSpeedList.keySet() + " with speed " + animalSpeedList.values());
        } else {
            int max = Collections.max(animalSpeedList.values());
            for (Map.Entry<String, Integer> entry : animalSpeedList.entrySet()) {
                if (entry.getValue() == max) {
                    System.out.println("Winner is " + entry.getKey() + " with speed " + max);
                }
            }
        }
    }

    public static void main(String[] args) {
        FlyAble lion = new Lion();
        FlyAble owl = new Owl();
        FlyAble tiger = new Tiger();
        FlyAble falcon = new Falcon();
        FlyAble pig = new Pig();

        AnimalRacing animalRacing = new AnimalRacing();
        List<FlyAble> animalList = Arrays.asList(lion, owl, tiger, falcon, pig);
        animalRacing.printWinner(animalList);
    }
}

