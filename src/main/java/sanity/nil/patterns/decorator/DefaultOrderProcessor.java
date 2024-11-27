package sanity.nil.patterns.decorator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class DefaultOrderProcessor implements OrderProcessor {

    @Override
    public UUID process(Order order) {
        if (order.getOrderDate().isBefore(LocalDateTime.now())
                && order.getTotalPrice() != null && order.getTotalPrice().compareTo(BigDecimal.ZERO) > 0) {
            UUID id = UUID.randomUUID();
            order.setId(id);
            return id;
        }
        return null;
    }
}
