package sanity.nil.patterns.decorator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class Order {
    private UUID id;
    private Map<Product, Integer> products = new HashMap<>();
    private BigDecimal totalPrice;
    private LocalDateTime orderDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Optional<Map<Product, Integer>> getProductByName(String name) {
        return products.keySet().stream()
                .filter(p -> p.getName().equals(name))
                .map(p -> Collections.singletonMap(p, products.get(p)))
                .findFirst();
    }

    public void addProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            Integer i = products.get(product);
            products.replace(product, i + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() {
        if (totalPrice != null) {
            return totalPrice;
        } else {
            return products.entrySet().stream()
                    .map(entry -> entry.getKey().getPrice().multiply(BigDecimal.valueOf(entry.getValue())))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
        }
    }

    public Order() {
        orderDate = LocalDateTime.now();
    }
}
