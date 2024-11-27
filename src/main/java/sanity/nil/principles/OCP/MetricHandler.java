package sanity.nil.principles.OCP;

public interface MetricHandler {
    MetricType getMetricType();
    void handle(String prefix);
}
