package lesson09_interface_animal;

public class FlyNoway implements FlyBehavior{
    @Override
    public boolean flyable() {
        return false;
    }
}
