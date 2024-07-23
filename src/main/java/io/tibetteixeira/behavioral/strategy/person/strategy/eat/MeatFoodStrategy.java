package io.tibetteixeira.behavioral.strategy.person.strategy.eat;

public class MeatFoodStrategy implements EatStrategy {

    @Override
    public void eat() {
        System.out.println("I eat meat food");
    }
}
