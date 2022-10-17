package lab_11;

import java.security.SecureRandom;

public class Pig implements FlyAble, MoveAble{

    private String name;
    private int speed;
    private boolean withWing;

    @Override
    public boolean withWing() {
        return false;
    }

    @Override
    public int speed() {
        return speed;
    }

    static final int PIG_MAX_SPEED = 60;

    public Pig() {
        this.name = getClass().getSimpleName();
        this.speed = new SecureRandom().nextInt(PIG_MAX_SPEED);
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
