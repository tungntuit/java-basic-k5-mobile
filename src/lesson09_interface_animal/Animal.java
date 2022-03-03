package lesson09_interface_animal;

public abstract class Animal {
    protected FlyBehavior flyBehavior;
    protected abstract double speed();

    public Animal() {
    }
}
