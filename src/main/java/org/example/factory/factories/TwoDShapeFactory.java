package org.example.factory.factories;

import org.example.factory.model.Circle;
import org.example.factory.model.Shape;
import org.example.factory.model.Square;
import org.example.factory.model.Triangle;

public class TwoDShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}
