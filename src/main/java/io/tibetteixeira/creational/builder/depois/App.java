package io.tibetteixeira.creational.builder.depois;

import io.tibetteixeira.creational.builder.antes.FastFoodMeal;
import io.tibetteixeira.creational.builder.depois.builder.FastFoodMealBuilder;
import io.tibetteixeira.creational.builder.depois.builder.FatMealBuilder;
import io.tibetteixeira.creational.builder.depois.builder.JustFriesBuilder;

public class App {
    public static void order(String name, FastFoodMealBuilder builder) {
        System.out.println("Ordering a " + name);
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("------------------");
    }

    public static void main(String[] args) {
        order("Just Fries", new JustFriesBuilder());
        order("Heart Atack", new FatMealBuilder());
    }
}
