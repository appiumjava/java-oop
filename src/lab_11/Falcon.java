package lab_11;

import java.security.SecureRandom;

public class Falcon implements FlyAble, MoveAble{

    private String name;
    private int speed;
    private boolean withWing;

    @Override
    public boolean withWing() {
        return true;
    }

    @Override
    public int speed() {
        return speed;
    }

    static final int FALCON_MAX_SPEED = 30;
    public Falcon() {
        this.speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
        this.withWing = withWing();
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", withWing=" + withWing +
                '}';
    }
}
