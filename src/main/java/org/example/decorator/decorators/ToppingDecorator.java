package org.example.decorator.decorators;

import org.example.decorator.model.Pizza;

//Extends Pizza, so all toppings have is-a relationship with Pizza and need to implement getCost()
public abstract class ToppingDecorator extends Pizza {
}
