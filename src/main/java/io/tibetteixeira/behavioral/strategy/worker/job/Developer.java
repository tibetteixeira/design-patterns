package io.tibetteixeira.behavioral.strategy.worker.job;

import io.tibetteixeira.behavioral.strategy.worker.strategy.eat.MeatFoodStrategy;
import io.tibetteixeira.behavioral.strategy.worker.strategy.transportation.CarStrategy;
import io.tibetteixeira.behavioral.strategy.worker.strategy.work.DeveloperStrategy;

public class Developer implements Worker {

    @Override
    public void work() {
        new DeveloperStrategy().work();
    }

    @Override
    public void eat() {
        new MeatFoodStrategy().eat();
    }

    @Override
    public void move() {
        new CarStrategy().move();
    }
}
