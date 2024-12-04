package io.tibetteixeira.behavioral.observer.party.observer;

public class Wife implements Observer{


    public void startParty() {
        System.out.println("Party started");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            startParty();
        } else {
            System.out.println("Waiting...");
        }
    }
}
