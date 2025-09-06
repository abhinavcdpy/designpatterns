package org.example.observer.observables;

import org.example.observer.observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    private int stock;
    private List<NotificationAlertObserver> observers;

    public IphoneObservableImpl(int stock) {
        this.stock = stock;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (!observers.isEmpty()) {
            for (NotificationAlertObserver observer : observers){
                //System.out.println("Notifying observer: " + observer);
                observer.update();
            }
        }
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
        notifyObservers();
    }

    @Override
    public int getStock() {
        return stock;
    }
}
