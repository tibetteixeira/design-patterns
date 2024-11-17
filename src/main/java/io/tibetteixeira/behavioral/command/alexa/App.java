package io.tibetteixeira.behavioral.command.alexa;

import io.tibetteixeira.behavioral.command.alexa.alexa.Alexa;
import io.tibetteixeira.behavioral.command.alexa.command.TurnOffLightCommand;
import io.tibetteixeira.behavioral.command.alexa.command.TurnOnLightCommand;
import io.tibetteixeira.behavioral.command.alexa.light.PositivoLight;
import io.tibetteixeira.behavioral.command.alexa.light.SamsungLight;

public class App {

    public static void main(String[] args) {
        Alexa alexa = new Alexa();
        configureAlexa(alexa);

        alexa.sendRequest("Turn on the Living room light");
        alexa.sendRequest("Turn off the Kitchen light");

        alexa.sendRequest("Please, could you Turn off the Living room light?");
    }

    private static void configureAlexa(Alexa alexa) {
        PositivoLight livingRoom = new PositivoLight();
        SamsungLight kitchen = new SamsungLight();

        alexa.addIntegration("Turn on the Living room light", new TurnOnLightCommand(livingRoom), "on", "Living room", "light");
        alexa.addIntegration("Turn off the Living room light", new TurnOffLightCommand(livingRoom), "off", "Living room", "light");
        alexa.addIntegration("Turn on the Kitchen light", new TurnOnLightCommand(kitchen), "on", "Kitchen", "light");
        alexa.addIntegration("Turn off the Kitchen light", new TurnOffLightCommand(kitchen), "off", "Kitchen", "light");
    }
}
