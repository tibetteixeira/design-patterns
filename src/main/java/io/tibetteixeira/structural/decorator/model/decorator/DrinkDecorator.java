package io.tibetteixeira.structural.decorator.model.decorator;

import io.tibetteixeira.structural.decorator.model.Drink;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class DrinkDecorator implements Drink {

    protected Drink drink;
}
