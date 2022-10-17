package lab_11;

import java.security.SecureRandom;

public class Tiger implements FlyAble, MoveAble{

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

    static final int TIGER_MAX_SPEED = 80;
    public Tiger() {
        this.name = getClass().getSimpleName();
        this.speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
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
