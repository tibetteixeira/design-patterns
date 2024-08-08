package io.tibetteixeira.behavioral.mediator.translator;

import io.tibetteixeira.behavioral.mediator.model.Language;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class Translator {

    Map<String, String> engToPort = new HashMap<>();
    Map<String, String> portToEng = new HashMap<>();

    public Translator() {
        portToEng.put("Oi", "Hello");
        portToEng.put("Tudo bem?", "How are you?");
        portToEng.put("Tchau", "Bye");

        engToPort.put("Hello", "Oi");
        engToPort.put("How are you?", "Tudo bem?");
        engToPort.put("Bye", "Tchau");
    }

    public String getTranslation(Language senderLanguage, Language receiverLanguage, String message) {
        if (senderLanguage.equals(receiverLanguage)) {
            return message;
        }

        if (Language.PORTUGUESE.equals(senderLanguage)) {
            return nonNull(portToEng.get(message)) ? portToEng.get(message) : message;
        }

        if (Language.ENGLAND.equals(senderLanguage)) {
            return nonNull(engToPort.get(message)) ? engToPort.get(message) : message;
        }

        return "";
    }
}
