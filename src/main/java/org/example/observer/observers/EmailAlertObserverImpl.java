package org.example.observer.observers;

import org.example.observer.observables.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private final StockObservable stockObservable;

    public EmailAlertObserverImpl(StockObservable stockObservable) {
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email Alert: iPhone stock is now " + stockObservable.getStock());
    }
}
