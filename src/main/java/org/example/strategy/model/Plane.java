package org.example.strategy.model;

import org.example.strategy.strategies.MoveStrategy;

public class Plane implements Vehicle {
    private final MoveStrategy moveStrategy;

    //Constructor Injection
    public Plane(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }


    @Override
    public void move() {
        moveStrategy.move(this);
    }
}
