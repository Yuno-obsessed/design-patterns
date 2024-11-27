package sanity.nil.patterns.chainOfResponsibility;

import java.util.UUID;

public class CorrelationHandler implements Handler, Comparable<Handler> {
    @Override
    public void handle(Request request, Object response) {
        if (!hasCorrelation(request)) {
            request.headers.put("X-Correlation-ID", UUID.randomUUID().toString());
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public int compareTo(Handler o) {
        return this.getOrder() - o.getOrder();
    }

    public boolean hasCorrelation(Request request) {
        return request.headers.containsKey("X-Correlation-ID");
    }
}
