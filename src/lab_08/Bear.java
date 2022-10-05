package lab_08;

import java.security.SecureRandom;

public class Bear extends Animals {

    static final int BEAR_MAX_SPEED = 100;

    public Bear(String name) {
        super(name, new SecureRandom().nextInt(BEAR_MAX_SPEED));
    }
}
