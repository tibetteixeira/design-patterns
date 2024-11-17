package io.tibetteixeira.behavioral.command.alexa.light;

public class SamsungLight implements GenericLight {

    public void turnOn() {
        System.out.println("The Samsung Light is On");
    }

    public void turnOff() {
        System.out.println("The Samsung Light is Off");
    }
}
