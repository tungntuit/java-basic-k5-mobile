package lesson09_Example;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void disableFlyAbility(){
        flyBehavior = new FlyNoWay();
    }
}
