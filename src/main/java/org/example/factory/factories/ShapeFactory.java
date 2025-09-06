package org.example.factory.factories;

import org.example.factory.model.Shape;

public interface ShapeFactory {
    Shape getShape(String shapeType);
}
