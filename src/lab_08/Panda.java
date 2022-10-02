package lab_08;

import java.security.SecureRandom;

public class Panda extends Animals{

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(70);
        return randomSpeed;
    }

    @Override
    public String getAnimalName() {
        return getClass().getSimpleName();
    }
}
