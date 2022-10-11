package lab_10;

import java.security.SecureRandom;

public class Cat extends Animals {

    static final int CAT_MAX_SPEED = 80;
    int speed = new SecureRandom().nextInt(CAT_MAX_SPEED);

    @Override
    public String getAnimalName() {
        return "Cat";
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
