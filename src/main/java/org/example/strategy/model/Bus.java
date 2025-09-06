package org.example.strategy.model;

import org.example.strategy.strategies.MoveStrategy;

public class Bus extends Vehicle {
    public Bus(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }
}
