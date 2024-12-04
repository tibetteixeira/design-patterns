package io.tibetteixeira.behavioral.observer.party.subject;

import io.tibetteixeira.behavioral.observer.party.observer.Observer;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    private boolean status;

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void setStatus(boolean newStatus) {
        if (newStatus != status) {
            this.status = newStatus;
            notifyObservers(newStatus);
        }
    }

    public void notifyObservers(boolean newStatus) {
        for (Observer o : observers) {
            o.update(newStatus);
        }
    }
}
