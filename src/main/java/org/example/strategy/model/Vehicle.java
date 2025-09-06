package org.example.strategy.model;

import org.example.strategy.strategies.MoveStrategy;

public abstract class Vehicle {
    private MoveStrategy moveStrategy;

    //Constructor Injection
    public Vehicle(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    //Car and Bus are driven, Plane is flown
    //Strategy comes in play here as two subclasses have same behavior and we want to avoid duplicate code (so we extract them out into a strategy)
    public void move(){
        moveStrategy.move(this);
    }
}
