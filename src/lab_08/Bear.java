package lab_08;

import java.security.SecureRandom;

public class Bear extends Animals {

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(100);
        return randomSpeed;
    }

    @Override
    public String getAnimalName() {
        return getClass().getSimpleName();
    }
}
