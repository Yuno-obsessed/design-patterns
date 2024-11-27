package sanity.nil.principles.OCP;

import java.util.concurrent.ScheduledExecutorService;

public class DatabaseBaseMonitor extends BaseMonitor {

    protected DatabaseBaseMonitor(ScheduledExecutorService executorService) {
        super(executorService);
    }

    @Override
    String prefix() {
        return "Database Metrics: ";
    }

}
