package io.tibetteixeira.behavioral.strategy.worker.strategy.eat;

public class VeganFoodStrategy implements EatStrategy {

    @Override
    public void eat() {
        System.out.println("I eat vegan food");
    }
}
