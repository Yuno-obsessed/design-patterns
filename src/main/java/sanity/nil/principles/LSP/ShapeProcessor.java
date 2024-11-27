package sanity.nil.principles.LSP;

import java.util.List;

public class ShapeProcessor {
    public void displayAreas(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Shape area: " + shape.calculateArea());
        }
    }
}
