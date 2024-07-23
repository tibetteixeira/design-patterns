package io.tibetteixeira.behavioral.strategy.person;

import io.tibetteixeira.behavioral.strategy.person.strategy.eat.EatStrategy;
import io.tibetteixeira.behavioral.strategy.person.strategy.transportation.TransportationStrategy;
import io.tibetteixeira.behavioral.strategy.person.strategy.work.WorkStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {

    private String name;
    private EatStrategy eatStrategy;
    private TransportationStrategy transportationStrategy;
    private WorkStrategy workStrategy;

    public void eat() {
        eatStrategy.eat();
    }

    public void move() {
        transportationStrategy.move();
    }

    public void work() {
        workStrategy.work();
    }
}
