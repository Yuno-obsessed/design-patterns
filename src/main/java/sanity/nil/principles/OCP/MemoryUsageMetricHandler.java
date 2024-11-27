package sanity.nil.principles.OCP;

public class MemoryUsageMetricHandler implements MetricHandler {
    @Override
    public MetricType getMetricType() {
        return () -> "Memory Usage";
    }

    @Override
    public void handle(String prefix) {
        System.out.println(prefix + "Collecting Memory usage data...");
    }
}