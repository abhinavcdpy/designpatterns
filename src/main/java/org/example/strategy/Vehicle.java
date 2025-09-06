package org.example.strategy;

import org.example.strategy.strategies.MoveStrategy;

public interface Vehicle {
    //Car and Bus are driven, Plane is flown
    //Strategy comes in play here as two subclasses have same behavior and we want to avoid duplicate code (so we extract them out into a strategy)
    void move();
}
