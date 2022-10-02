package lab_08;

public class Animals {

    private String animalName;
    private int speed;

    public Animals() {
    }

    public Animals(String animalName, int speed) {
        this.animalName = animalName;
        this.speed = speed;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getSpeed() {
        return speed;
    }

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
