package io.tibetteixeira.behavioral.mediator.mediator;

import io.tibetteixeira.behavioral.mediator.model.User;

public class ChatMediator extends Mediator {

    @Override
    protected String getMessage(String message, User to, User from) {
        return message;
    }
}
