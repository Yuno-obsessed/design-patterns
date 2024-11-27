package sanity.nil.patterns.chainOfResponsibility;

public interface Handler {
    void handle(Request request, Object response);
    int getOrder();

}
