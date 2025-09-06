package org.example.strategy;

import org.example.strategy.model.Bus;
import org.example.strategy.model.Car;
import org.example.strategy.model.Plane;
import org.example.strategy.model.Vehicle;
import org.example.strategy.strategies.Drive;
import org.example.strategy.strategies.Fly;

public class StrategyPatternRunner {
    public static void main(String[] args) {
        /**
         * Car and Bus are driven, Plane is flown
         * Strategy comes in play here as two subclasses have same behavior and we want to avoid duplicate code (so we extract them out into a strategy)
         */

        Vehicle car = new Car(new Drive());     //MoveStrategy Passed in Constructor
        car.move();

        Vehicle bus = new Bus(new Drive());
        bus.move();

        Vehicle plane = new Plane(new Fly());
        plane.move();
    }
}
