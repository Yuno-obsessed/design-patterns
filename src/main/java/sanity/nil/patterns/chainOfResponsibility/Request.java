package sanity.nil.patterns.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public abstract class Request {

    public Object body;
    public Map<String, String> headers = new HashMap<>();

    public Request(Object body) {
        this.body = body;
    }
}
