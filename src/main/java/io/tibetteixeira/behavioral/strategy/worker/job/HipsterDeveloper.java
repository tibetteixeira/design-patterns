package io.tibetteixeira.behavioral.strategy.worker.job;

import io.tibetteixeira.behavioral.strategy.worker.strategy.eat.VeganFoodStrategy;
import io.tibetteixeira.behavioral.strategy.worker.strategy.transportation.BikeStrategy;
import io.tibetteixeira.behavioral.strategy.worker.strategy.work.DeveloperStrategy;

public class HipsterDeveloper implements Worker {

    @Override
    public void work() {
        new DeveloperStrategy().work();
    }

    @Override
    public void eat() {
        new VeganFoodStrategy().eat();
    }

    @Override
    public void move() {
        new BikeStrategy().move();
    }
}
