package io.tibetteixeira.behavioral.strategy.worker.strategy.work;

public class PilotStrategy implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("I pilot to earn some money");
    }
}
