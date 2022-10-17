package lab_11;

import java.security.SecureRandom;

public class Owl implements FlyAble, MoveAble{

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

    static final int OWL_MAX_SPEED = 50;
    public Owl() {
        this.name = getClass().getSimpleName();
        this.speed = new SecureRandom().nextInt(OWL_MAX_SPEED);
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
