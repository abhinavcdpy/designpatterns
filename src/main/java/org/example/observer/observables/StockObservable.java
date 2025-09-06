package org.example.observer.observables;

import org.example.observer.observers.NotificationAlertObserver;

public interface StockObservable {
    //Methods to add, remove and notify observers (IMPORTANT TO REMEMBER)
    void addObserver(NotificationAlertObserver observer);
    void removeObserver(NotificationAlertObserver observer);
    void notifyObservers();

    int getStock();
    void setStock(int stock);
}
