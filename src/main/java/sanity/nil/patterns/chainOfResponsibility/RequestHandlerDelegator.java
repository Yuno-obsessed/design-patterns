package sanity.nil.patterns.chainOfResponsibility;

import java.util.List;

public class RequestHandlerDelegator {

    private List<Handler> handlers;

    public RequestHandlerDelegator(List<Handler> handlers) {
        this.handlers = handlers.stream().sorted().toList();
    }

    public Object handleRequest(Request request) {
        Object response = new Object();
        handlers.forEach(handler -> handler.handle(request, response));
        return response;
    }
}
