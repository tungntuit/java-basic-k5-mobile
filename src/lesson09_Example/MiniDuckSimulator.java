package lesson09_Example;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.disableFlyAbility();
        mallardDuck.performFly();
    }
}
