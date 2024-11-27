package sanity.nil.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {
    private final Map<String, Cell> cellCache = new HashMap<>();

    public Cell getCell(String type, String function) {
        cellCache.putIfAbsent(type, new Cell(type, function));
        return cellCache.get(type);
    }
}