package org.example.observer;

import org.example.observer.observables.IphoneObservableImpl;
import org.example.observer.observables.StockObservable;
import org.example.observer.observers.EmailAlertObserverImpl;
import org.example.observer.observers.NotificationAlertObserver;
import org.example.observer.observers.SmsAlertObserverImpl;

public class ObserverPatternRunner {
    public static void main(String[] args) {
        /**
         * NOTE: See how emailObserver gets the stock (via constructor injection) instead of directly taking it in as int parameter
         */
        StockObservable iPhoneStockObservable = new IphoneObservableImpl(2);

        NotificationAlertObserver emailObserver = new EmailAlertObserverImpl(iPhoneStockObservable);
        NotificationAlertObserver smsObserver = new SmsAlertObserverImpl(iPhoneStockObservable);

        iPhoneStockObservable.addObserver(emailObserver);
        iPhoneStockObservable.addObserver(smsObserver);

        iPhoneStockObservable.setStock(10);
        iPhoneStockObservable.setStock(5);
        iPhoneStockObservable.setStock(0);
    }
}
