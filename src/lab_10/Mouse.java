package lab_10;

import java.security.SecureRandom;

public class Mouse extends Animals {

    static final int MOUSE_MAX_SPEED = 50;
    @Override
    public String getAnimalName() {
        return "Mouse";
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(MOUSE_MAX_SPEED);
    }
}
