package lab_08;

import java.security.SecureRandom;

public class Horse extends Animals {

    static final int HORSE_MAX_SPEED = 120;

    public Horse(String name) {
        super(name, new SecureRandom().nextInt(HORSE_MAX_SPEED));
    }
}
