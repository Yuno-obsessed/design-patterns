package sanity.nil.principles.LSP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(5);
        Shape circle = new Circle(3);

        ShapeProcessor shapeProcessor = new ShapeProcessor();
        shapeProcessor.displayAreas(Arrays.asList(rectangle, square, circle));
    }
}
