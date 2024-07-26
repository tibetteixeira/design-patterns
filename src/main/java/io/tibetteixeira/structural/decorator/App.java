package io.tibetteixeira.structural.decorator;

import io.tibetteixeira.structural.decorator.model.Coffee;
import io.tibetteixeira.structural.decorator.model.Drink;
import io.tibetteixeira.structural.decorator.model.Juice;
import io.tibetteixeira.structural.decorator.model.Tea;
import io.tibetteixeira.structural.decorator.model.decorator.DoubleDrink;
import io.tibetteixeira.structural.decorator.model.decorator.Milk;

import static java.lang.String.format;

public class App {

    public static void main(String[] args) {
        order(new Coffee());
        order(new Tea());
        order(new Juice());
        order(new DoubleDrink(new Juice()));
        order(new Milk(new Juice()));
        order(new Milk(new Coffee()));
    }

    private static void order(Drink drink) {
        drink.serve();
        System.out.println(format("It costs $%.2f", drink.getPrice()));
        System.out.println("-----------------");
    }
}
