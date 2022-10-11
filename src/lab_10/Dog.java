package lab_10;

import java.security.SecureRandom;

public class Dog extends Animals {

    static final int DOG_MAX_SPEED = 80;
    int speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
    @Override
    public String getAnimalName() {
        return "Dog";
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

