package sanity.nil.patterns.decorator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Banana", BigDecimal.valueOf(14));
        Product product2 = new Product("TV", BigDecimal.valueOf(700));
        Product product3 = new Product("Microwave", BigDecimal.valueOf(400));
        Order order = new Order();
        order.addProduct(product1, 2);
        order.addProduct(product2, 1);
        order.addProduct(product3, 1);

        DefaultOrderProcessor processor = new DefaultOrderProcessor();
        DiscountedProductAwareDecorator decorator = new DiscountedProductAwareDecorator(processor);
        decorator.addDiscount("TV", BigDecimal.valueOf(40));
        decorator.process(order);
    }
}
