package lesson09_Example;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Mute!!!");
    }
}
