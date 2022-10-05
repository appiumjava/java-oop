package lab_08;

import java.security.SecureRandom;

public class Panda extends Animals {

    static final int PANDA_MAX_SPEED = 80;

    public Panda(String name) {
        super(name, new SecureRandom().nextInt(PANDA_MAX_SPEED));
    }
}

