package io.tibetteixeira.behavioral.strategy.worker.strategy.transportation;

public class AirplaneStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I pilot airplanes to go anywhere");
    }
}
