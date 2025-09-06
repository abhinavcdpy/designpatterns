package org.example.strategy.model;

import org.example.strategy.strategies.MoveStrategy;

public class Car extends Vehicle {
    //Constructor Injection
    public Car(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }
}
