package org.example.strategy;

import org.example.strategy.strategies.Drive;
import org.example.strategy.strategies.Fly;

public class StrategyPatternRunner {
    public static void main(String[] args) {
        Vehicle car = new Car(new Drive());     //MoveStrategy Passed in Constructor
        car.move();

        Vehicle bus = new Bus(new Drive());
        bus.move();

        Vehicle plane = new Plane(new Fly());
        plane.move();
    }
}
