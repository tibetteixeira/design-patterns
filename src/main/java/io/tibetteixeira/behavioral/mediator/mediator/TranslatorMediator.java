package io.tibetteixeira.behavioral.mediator.mediator;


import io.tibetteixeira.behavioral.mediator.model.User;
import io.tibetteixeira.behavioral.mediator.translator.Translator;

public class TranslatorMediator extends Mediator {

    private Translator translator = new Translator();

    @Override
    protected String getMessage(String message, User to, User from) {
        return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }
}
