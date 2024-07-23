package io.tibetteixeira.behavioral.strategy.worker;

import io.tibetteixeira.behavioral.strategy.worker.job.Developer;
import io.tibetteixeira.behavioral.strategy.worker.job.HipsterDeveloper;
import io.tibetteixeira.behavioral.strategy.worker.job.Pilot;
import io.tibetteixeira.behavioral.strategy.worker.job.Worker;

public class App {
    public static void main(String[] args) {

        Worker dev = new Developer();
        presentYourself(dev, "Sona");

        Worker hipsterDev = new HipsterDeveloper();
        presentYourself(hipsterDev, "Ivern");

        Worker pilot = new Pilot();
        presentYourself(pilot, "Corki");
    }

    private static void presentYourself(Worker worker, String name) {
        System.out.println("Hi, my name is " + name);
        worker.eat();
        worker.move();
        worker.work();
        System.out.println("\n-----\n");
    }

}
