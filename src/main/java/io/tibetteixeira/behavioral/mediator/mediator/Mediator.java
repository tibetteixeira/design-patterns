package io.tibetteixeira.behavioral.mediator.mediator;

import io.tibetteixeira.behavioral.mediator.model.User;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;
import static java.util.Objects.nonNull;
import static org.apache.commons.lang3.BooleanUtils.isFalse;

public abstract class Mediator {

    protected Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        System.out.println(format("'%s' is in the room", user.getName()));
        users.put(user.getName(), user);
    }

    public void removeUser(User user) {
        System.out.println(format("'%s' is out", user.getName()));
        users.remove(user.getName());
    }

    public void sendMessage(String message, User to, User from) {
        if (nonNull(to)) {
            to.receiveMessage(getMessage(message, to, from), from);
            return;
        }

        users.values().stream()
                .filter(user -> isFalse(user.getName().equals(from.getName())))
                .forEach(user -> user.receiveMessage(getMessage(message, user, from), from));
    }

    protected abstract String getMessage(String message, User to, User from);
}
