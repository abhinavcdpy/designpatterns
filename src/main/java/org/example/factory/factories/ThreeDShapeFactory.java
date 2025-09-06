package org.example.factory.factories;

import org.example.factory.model.Cone;
import org.example.factory.model.Cube;
import org.example.factory.model.Shape;
import org.example.factory.model.Sphere;

public class ThreeDShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("SPHERE")) {
            return new Sphere();
        } else if (shapeType.equalsIgnoreCase("CUBE")) {
            return new Cube();
        } else if (shapeType.equalsIgnoreCase("CONE")) {
            return new Cone();
        }
        return null;
    }
}
