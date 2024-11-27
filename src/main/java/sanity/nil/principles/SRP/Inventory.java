package sanity.nil.principles.SRP;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Book, Integer> bookStock = new HashMap<>();

    public void addBook(Book book, int quantity) {
        bookStock.put(book, bookStock.getOrDefault(book, 0) + quantity);
    }

    public void removeBook(Book book, int quantity) {
        if (bookStock.containsKey(book) && bookStock.get(book) >= quantity) {
            bookStock.put(book, bookStock.get(book) - quantity);
            if (bookStock.get(book) == 0) {
                bookStock.remove(book);
            }
        } else {
            System.out.println("Not enough stock to remove.");
        }
    }

    public int getStock(Book book) {
        return bookStock.getOrDefault(book, 0);
    }

    @Override
    public String toString() {
        return "Inventory: " + bookStock;
    }
}
