package lession07;

public class AnimalRacingBuilder {
    private int speed;
    private String animalName;
    private boolean flyable;

    public AnimalRacingBuilder() {
    }

    private AnimalRacingBuilder(Builder builder) {
        animalName = builder.animalName;
        flyable = builder.flyable;
        speed = builder.speed;
    }

    public AnimalRacingBuilder(boolean flyable) {
        this.flyable = flyable;
    }

    public void setFlyable(boolean flyable) {
        this.flyable = flyable;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder {
        private int speed;
        private String animalName;
        private boolean flyable;


        // method chaining

        public Builder withAnimalName(String name) {
            this.animalName = name;
            return this;
        }

        public Builder withSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder withFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalRacingBuilder build (){
            return new AnimalRacingBuilder(this);
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
