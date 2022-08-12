package ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Observer curr;
        Iterator it = observers.iterator();
        System.out.println("**********************");
        while (it.hasNext()) {
            curr = (Observer) it.next();
            curr.update(this);
        }
        System.out.println("**********************");
    }

    public abstract int getNumber();

    public abstract void execute();
}
