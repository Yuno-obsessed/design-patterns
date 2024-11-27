package sanity.nil.patterns.decorator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class DiscountedProductAwareDecorator extends BaseDecorator {

    private Map<String, BigDecimal> discounts = new HashMap<>();

    public DiscountedProductAwareDecorator(OrderProcessor processor) {
        super(processor);
    }

    public void addDiscount(String productName, BigDecimal discount) {
        discounts.putIfAbsent(productName, discount);
    }

    @Override
    public UUID process(Order order) {
        Map<Product,Integer> discountedProductsInOrder = discounts.keySet().stream()
                .filter(discountedProduct -> order.getProductByName(discountedProduct).isPresent())
                .map(productFound -> order.getProductByName(productFound).get())
                .collect(Collectors.toMap(
                        entry -> entry.keySet().iterator().next(),
                        entry -> entry.values().iterator().next()
                ));
        BigDecimal totalDiscount = BigDecimal.ZERO;

        for (Map.Entry<Product, Integer> entry : discountedProductsInOrder.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            BigDecimal discountPercentage = discounts.get(product.getName());

            BigDecimal discountAmount = product.getPrice()
                    .multiply(discountPercentage)
                    .divide(BigDecimal.valueOf(100), 10, RoundingMode.UNNECESSARY)
                    .multiply(BigDecimal.valueOf(quantity));

            totalDiscount = totalDiscount.add(discountAmount);
        }

        System.out.println("Primary price: " + order.getTotalPrice());
        order.setTotalPrice(order.getTotalPrice().subtract(totalDiscount));
        System.out.println("After discount price: " + order.getTotalPrice());

        return super.process(order);
    }


}
