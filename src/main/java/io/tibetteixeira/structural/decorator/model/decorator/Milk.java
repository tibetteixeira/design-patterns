package io.tibetteixeira.structural.decorator.model.decorator;

import io.tibetteixeira.structural.decorator.model.Drink;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- putting 50ml of milk in the drink");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 1.30;
    }
}
