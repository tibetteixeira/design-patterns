package io.tibetteixeira.behavioral.mediator;

import io.tibetteixeira.behavioral.mediator.mediator.ChatMediator;
import io.tibetteixeira.behavioral.mediator.mediator.Mediator;
import io.tibetteixeira.behavioral.mediator.mediator.TranslatorMediator;
import io.tibetteixeira.behavioral.mediator.model.Language;
import io.tibetteixeira.behavioral.mediator.model.User;

public class App {

    public static void main(String[] args) {
        initChatMediator();
        initTranslatorMediator();
    }

    private static void initChatMediator() {
        Mediator chatRoom = new ChatMediator();
        User alan = new User("Alan", Language.ENGLAND, chatRoom);
        User john = new User("John", Language.ENGLAND, chatRoom);
        User carlos = new User("Carlos", Language.PORTUGUESE, chatRoom);

        chatRoom.addUser(alan);
        chatRoom.addUser(john);
        chatRoom.addUser(carlos);

        alan.sendMessage("Hello");
        carlos.sendMessage("Oi");
        john.sendMessage("Hello", alan);

        chatRoom.removeUser(carlos);
    }


    private static void initTranslatorMediator() {
        Mediator chatRoom = new TranslatorMediator();
        User alan = new User("Alan", Language.ENGLAND, chatRoom);
        User john = new User("John", Language.ENGLAND, chatRoom);
        User carlos = new User("Carlos", Language.PORTUGUESE, chatRoom);

        chatRoom.addUser(alan);
        chatRoom.addUser(john);
        chatRoom.addUser(carlos);

        alan.sendMessage("Hello");
        carlos.sendMessage("Oi");
        john.sendMessage("Hello", alan);
        carlos.sendMessage("Tudo bem?", alan);
        john.sendMessage("How are you?");
    }
}
