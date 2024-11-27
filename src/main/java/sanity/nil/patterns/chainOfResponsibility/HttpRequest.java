package sanity.nil.patterns.chainOfResponsibility;

public class HttpRequest extends Request {

    {
        this.headers.put("user-agent", "Mozilla");
    }

    public HttpRequest(Object body) {
        super(body);
    }
}
