package org.example.strategy.model;

import org.example.strategy.strategies.MoveStrategy;

public class Bus implements Vehicle {
    private final MoveStrategy moveStrategy;

    //Constructor Injection
    public Bus(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }


    @Override
    public void move() {
        moveStrategy.move(this);
    }
}
