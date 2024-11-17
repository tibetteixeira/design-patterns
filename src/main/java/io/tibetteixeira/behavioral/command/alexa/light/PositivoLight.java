package io.tibetteixeira.behavioral.command.alexa.light;

public class PositivoLight implements GenericLight {

    public void turnOn() {
        System.out.println("The Positivo Light is On");
    }

    public void turnOff() {
        System.out.println("The Positivo Light is Off");
    }
}
