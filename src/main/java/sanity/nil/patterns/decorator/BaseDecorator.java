package sanity.nil.patterns.decorator;

import java.util.UUID;

public abstract class BaseDecorator implements OrderProcessor {

    private OrderProcessor processor;

    public BaseDecorator(OrderProcessor processor) {
        this.processor = processor;
    }

    public void setProcessor(OrderProcessor processor) {
        this.processor = processor;
    }

    @Override
    public UUID process(Order order) {
        return processor.process(order);
    }
}
