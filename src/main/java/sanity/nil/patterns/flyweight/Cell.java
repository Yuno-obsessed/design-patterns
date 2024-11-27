package sanity.nil.patterns.flyweight;

public class Cell {
    private final String type;
    private final String function;

    public Cell(String type, String function) {
        this.type = type;
        this.function = function;
    }

    public void performFunction(String location) {
        System.out.println("Cell type: " + type + ", performing function: " + function + " at " + location);
    }
}