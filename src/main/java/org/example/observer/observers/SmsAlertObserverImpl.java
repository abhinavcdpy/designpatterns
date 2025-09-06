package org.example.observer.observers;

import org.example.observer.observables.StockObservable;

public class SmsAlertObserverImpl implements NotificationAlertObserver{
    private final StockObservable stockObservable;

    public SmsAlertObserverImpl(StockObservable stockObservable) {
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("SMS Alert: iPhone stock is now " + stockObservable.getStock());
    }
}
