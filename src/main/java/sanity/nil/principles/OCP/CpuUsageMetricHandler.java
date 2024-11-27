package sanity.nil.principles.OCP;

public class CpuUsageMetricHandler implements MetricHandler {
    @Override
    public MetricType getMetricType() {
        return () -> "CPU Usage";
    }

    @Override
    public void handle(String prefix) {
        System.out.println(prefix + "Collecting CPU usage data...");
    }
}