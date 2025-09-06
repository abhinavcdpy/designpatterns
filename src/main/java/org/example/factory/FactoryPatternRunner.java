package org.example.factory;

import org.example.factory.factories.ShapeFactory;
import org.example.factory.factories.AbstractShapeFactory;
import org.example.factory.model.Shape;

public class FactoryPatternRunner {
    /**
     * Factory pattern is to be used when we want to create objects based on some conditions
     * Abstract Factory is a factory of factories (Here, we have two factories - 2DShapeFactory and 3DShapeFactory)
     */

    public static void main(String[] args) {
        AbstractShapeFactory abstractShapeFactory = new AbstractShapeFactory();

        // Get 2D shape factory
        ShapeFactory twoDShapeFactory = abstractShapeFactory.getFactory("2D");
        // Get a Circle object and call its draw method
        Shape circle = twoDShapeFactory.getShape("CIRCLE");
        circle.draw();

        // Get 3D shape factory
        ShapeFactory threeDShapeFactory = abstractShapeFactory.getFactory("3D");
        // Get a Sphere object and call its draw method
        Shape sphere = threeDShapeFactory.getShape("SPHERE");
        sphere.draw();
    }
}
