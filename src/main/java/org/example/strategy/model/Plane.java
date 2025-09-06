package org.example.strategy.model;

import org.example.strategy.strategies.MoveStrategy;

public class Plane extends Vehicle {
    public Plane(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }
}
