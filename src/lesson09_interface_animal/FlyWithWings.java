package lesson09_interface_animal;

public class FlyWithWings implements FlyBehavior{
    @Override
    public boolean flyable() {
        return true;
    }
}
