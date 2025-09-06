package org.example.strategy.strategies;

import org.example.strategy.Vehicle;

public class Drive implements MoveStrategy{
    @Override
    public void move(Vehicle vehicle) {
        System.out.println("Drive to move " + vehicle.getClass().getSimpleName());
    }
}
