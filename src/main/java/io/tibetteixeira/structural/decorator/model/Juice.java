package io.tibetteixeira.structural.decorator.model;

public class Juice implements Drink {

    @Override
    public void serve() {
        System.out.println("Adding 250ml of juice");
    }

    @Override
    public Double getPrice() {
        return 4.0;
    }
}
