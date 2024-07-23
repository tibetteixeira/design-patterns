package io.tibetteixeira.behavioral.strategy.person.strategy.work;

public class DriverStrategy implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("I drive a car to earn some money");
    }
}
