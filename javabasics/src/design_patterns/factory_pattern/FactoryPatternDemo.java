package design_patterns.factory_pattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape("Circle");
        circleShape.draw();

        Shape squareShape = shapeFactory.getShape("Square");
        squareShape.draw();

        Shape rectangleShape = shapeFactory.getShape("Rectangle");
        rectangleShape.draw();
    }
}
