package io.tibetteixeira.behavioral.strategy.worker.job;

import io.tibetteixeira.behavioral.strategy.worker.strategy.eat.MeatFoodStrategy;
import io.tibetteixeira.behavioral.strategy.worker.strategy.transportation.AirplaneStrategy;
import io.tibetteixeira.behavioral.strategy.worker.strategy.work.PilotStrategy;

public class Pilot implements Worker {

    @Override
    public void work() {
        new PilotStrategy().work();
    }

    @Override
    public void eat() {
        new MeatFoodStrategy().eat();
    }

    @Override
    public void move() {
        new AirplaneStrategy().move();
    }
}
