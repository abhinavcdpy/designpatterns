package org.example.strategy;

import org.example.strategy.strategies.MoveStrategy;

public class Car implements Vehicle {
    private final MoveStrategy moveStrategy;

    //Constructor Injection
    public Car(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void move() {
        moveStrategy.move(this);
    }
}
