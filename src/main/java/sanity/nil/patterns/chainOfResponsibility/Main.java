package sanity.nil.patterns.chainOfResponsibility;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Handler> handlers = List.of(new RequestLoggingHandler(), new CorrelationHandler());
        Request request = new HttpRequest(null);
        RequestHandlerDelegator requestHandlerDelegator = new RequestHandlerDelegator(handlers);
        requestHandlerDelegator.handleRequest(request);
    }
}
