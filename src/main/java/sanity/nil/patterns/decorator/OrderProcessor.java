package sanity.nil.patterns.decorator;

import java.util.UUID;

public interface OrderProcessor {

    UUID process(Order order);
}
