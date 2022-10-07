package lab_09_1;

public class Animal {

    private String name;
    private int speed;
    private boolean withWing;

    public Animal(String name, int speed, boolean withWing) {
        this.name = name;
        this.speed = speed;
        this.withWing = withWing;
    }

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.withWing = builder.withWing;
    }
    //READ-ONLY


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWing() {
        return withWing;
    }

    //Inner class
    public static class Builder {

        private String name;
        private int speed;
        private boolean withWing;

        //WRITE ONLY
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWithWing(boolean withWing) {
            this.withWing = withWing;
            return this;
        }

        public Animal builder() {
            return new Animal(this);
        }
    }
}
