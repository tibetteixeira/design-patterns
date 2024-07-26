package io.tibetteixeira.structural.decorator.model;

public class Coffee implements Drink {

    @Override
    public void serve() {
        System.out.println("Adding 50ml of coffee");
    }

    @Override
    public Double getPrice() {
        return 1.5;
    }
}
