package io.tibetteixeira.behavioral.command.alexa.command;

import io.tibetteixeira.behavioral.command.alexa.light.GenericLight;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOffLightCommand implements Command {

    private GenericLight light;

    @Override
    public void execute() {
        light.turnOff();
    }
}
