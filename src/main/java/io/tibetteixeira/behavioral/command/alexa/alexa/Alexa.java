package io.tibetteixeira.behavioral.command.alexa.alexa;

import io.tibetteixeira.behavioral.command.alexa.command.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alexa {

    private Map<String, Command> integrations = new HashMap<>();
    private Map<String, String[]> associations = new HashMap<>();

    public void addIntegration(String key, Command command, String... keywords) {
        integrations.put(key, command);
        associations.put(key, keywords);
    }

    public void sendRequest(String request) {
        Command command = integrations.get(request);
        if (command == null) {
            String key = getFindAssociations(request);
            command = integrations.get(key);
            if (command == null) {
                System.out.println("Sorry, I can't perform your request!");
                return;
            }
        }
        System.out.println("Send a generic command as you saved in my configurations");
        command.execute();
    }

    public String getFindAssociations(String request) {
        for (String[] association : associations.values()) {
            if (Stream.of(association).allMatch(request::contains)) {
                return getKeyFromAssociations(association);
            }
        }
        return null;
    }

    private String getKeyFromAssociations(String... keywords) {
        return associations
                .entrySet()
                .stream()
                .filter(entry -> keywords.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().get();
    }

}
