package org.example.strategy.strategies;

import org.example.strategy.Vehicle;

public class Fly implements MoveStrategy{
    @Override
    public void move(Vehicle vehicle) {
        System.out.println("Fly to move " + vehicle.getClass().getSimpleName());
    }
}
