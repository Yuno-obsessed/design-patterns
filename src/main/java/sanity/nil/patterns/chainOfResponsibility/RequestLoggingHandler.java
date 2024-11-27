package sanity.nil.patterns.chainOfResponsibility;

import java.time.ZonedDateTime;

public class RequestLoggingHandler implements Handler, Comparable<Handler> {
    @Override
    public void handle(Request request, Object response) {
        String log = "%s | %s | %s".formatted(ZonedDateTime.now(),
                request.headers.getOrDefault("X-Correlation-ID", null), request.toString());
        System.out.println(log);
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public int compareTo(Handler o) {
        return this.getOrder() - o.getOrder();
    }
}
