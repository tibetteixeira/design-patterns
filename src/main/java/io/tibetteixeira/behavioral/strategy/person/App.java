package io.tibetteixeira.behavioral.strategy.person;


import io.tibetteixeira.behavioral.strategy.person.strategy.eat.MeatFoodStrategy;
import io.tibetteixeira.behavioral.strategy.person.strategy.eat.VeganFoodStrategy;
import io.tibetteixeira.behavioral.strategy.person.strategy.transportation.BikeStrategy;
import io.tibetteixeira.behavioral.strategy.person.strategy.transportation.CarStrategy;
import io.tibetteixeira.behavioral.strategy.person.strategy.work.DeveloperStrategy;
import io.tibetteixeira.behavioral.strategy.person.strategy.work.DriverStrategy;

public class App {
    public static void main(String[] args) {

        Person dev = new Person("Heimerdinger", new MeatFoodStrategy(), new CarStrategy(), new DeveloperStrategy());
        presentYourself(dev);

        Person hipsterDev = new Person("Milio", new VeganFoodStrategy(), new BikeStrategy(), new DeveloperStrategy());
        presentYourself(hipsterDev);

        Person pilot = new Person("Lee Sin", new MeatFoodStrategy(), new CarStrategy(), new DriverStrategy());
        presentYourself(pilot);
    }

    private static void presentYourself(Person person) {
        System.out.println("Hi, my name is " + person.getName());
        person.eat();
        person.move();
        person.work();
        System.out.println("\n-----\n");
    }

}
