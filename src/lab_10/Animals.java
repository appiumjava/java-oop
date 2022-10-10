package lab_10;

public abstract class Animals {

    private String animalName;
    private int speed;

    public Animals() {
    }

    public Animals(String animalName, int speed) {
        this.animalName = animalName;
        this.speed = speed;
    }

    public abstract String getAnimalName();

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public abstract int getSpeed();

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animalName='" + animalName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
