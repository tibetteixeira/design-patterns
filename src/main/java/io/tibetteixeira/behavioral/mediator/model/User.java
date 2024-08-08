package io.tibetteixeira.behavioral.mediator.model;

import io.tibetteixeira.behavioral.mediator.mediator.Mediator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static java.lang.String.format;
import static java.util.Objects.nonNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private Language language;
    private Mediator mediator;

    public void sendMessage(String message) {
        sendMessage(message, null);
    }

    public void sendMessage(String message, User to) {
        String receiverName = nonNull(to) ? to.getName() : "ALL";
        System.out.println(format("'%s' is sending the message '%s' to '%s'", name, message, receiverName));
        mediator.sendMessage(message, to, this);
    }

    public void receiveMessage(String message, User from) {
        System.out.println(format("'%s' has received the message '%s' from '%s'", this.getName(), message, from.getName()));
    }

}
