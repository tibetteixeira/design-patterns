package io.tibetteixeira.behavioral.observer.party;

import io.tibetteixeira.behavioral.observer.party.observer.Friend;
import io.tibetteixeira.behavioral.observer.party.observer.Wife;
import io.tibetteixeira.behavioral.observer.party.subject.Doorman;
import io.tibetteixeira.behavioral.observer.party.subject.Subject;

public class App {

    public static void main(String[] args) {
        Subject subject = new Doorman();
        subject.add(new Wife());
        subject.add(new Friend());

        System.out.println("Husband is coming");
        subject.setStatus(true);
        subject.setStatus(true);
        subject.setStatus(true);
        subject.setStatus(false);
        subject.setStatus(false);
        subject.setStatus(true);
    }
}
