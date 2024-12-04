package io.tibetteixeira.behavioral.observer.party.observer;

public class Friend implements Observer {

    public void sendGift() {
        System.out.println("Gift sent");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            sendGift();
        } else {
            System.out.println("Waiting...");
        }
    }
}
