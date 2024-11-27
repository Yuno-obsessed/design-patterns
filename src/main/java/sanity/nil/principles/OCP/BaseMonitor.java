package sanity.nil.principles.OCP;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class BaseMonitor {

    private final List<MetricHandler> metricHandlers = new ArrayList<>();
    private final ScheduledExecutorService executorService;
    private long delay;
    private TimeUnit delayUnit;

    protected BaseMonitor(ScheduledExecutorService executorService) {
        this.executorService = executorService;
        setDelay(3, TimeUnit.SECONDS);
    }

    abstract String prefix();

    protected void setDelay(long delay, TimeUnit unit) {
        this.delay = delay;
        delayUnit = unit;
    }

    protected void connect(MetricType metricType) {
        MetricHandler handler = findHandlerForMetricType(metricType);
        if (handler != null) {
            executorService.scheduleAtFixedRate(() -> {
                handler.handle(prefix());
            }, delay, delay, delayUnit);
        } else {
            throw new IllegalArgumentException("Unsupported MetricType: " + metricType.expose());
        }
    }

    protected List<MetricType> supportedMetrics() {
        List<MetricType> metrics = new ArrayList<>();
        for (MetricHandler handler : metricHandlers) {
            metrics.add(handler.getMetricType());
        }
        return metrics;
    }

    protected void addHandler(MetricHandler handler) {
        metricHandlers.add(handler);
    }

    private MetricHandler findHandlerForMetricType(MetricType metricType) {
        return metricHandlers.stream()
                .filter(handler -> handler.getMetricType().expose().equals(metricType.expose()))
                .findFirst()
                .orElse(null);
    }
}
