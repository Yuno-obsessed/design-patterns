package sanity.nil.principles.OCP;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        DatabaseBaseMonitor databaseMonitor = new DatabaseBaseMonitor(executorService);

        databaseMonitor.addHandler(new CpuUsageMetricHandler());
        databaseMonitor.addHandler(new MemoryUsageMetricHandler());

        MetricType cpuMetric = () -> "CPU Usage";
        MetricType memoryMetric = () -> "Memory Usage";

        System.out.println("Supported Metrics: ");
        databaseMonitor.supportedMetrics().forEach(metric -> System.out.println(metric.expose()));

        System.out.println("\nStarting monitoring...");
        databaseMonitor.connect(cpuMetric);
        databaseMonitor.connect(memoryMetric);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
