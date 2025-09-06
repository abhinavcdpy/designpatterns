package org.example.factory.factories;

public class AbstractShapeFactory {
    public static ShapeFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("2D")){
            return new TwoDShapeFactory();
        } else if (choice.equalsIgnoreCase("3D")) {
            return new ThreeDShapeFactory();
        }
        return null;
    }
}
