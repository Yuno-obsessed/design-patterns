package sanity.nil.patterns.factory;

import java.util.UUID;

public class DummyWorker implements Worker {

    private UUID id;
    private String taskName;
    private String connectorType;
    private int remainingTasks;

    @Override
    public void doWork() {
        String connection = (String) connect();
        System.out.println("Connected successfully:\n" + connection);
        while (remainingTasks > 0) {
            remainingTasks--;
            System.out.printf("Working, %d tasks left ...\n", remainingTasks);
        }
    }

    @Override
    public UUID getID() {
        return id;
    }

    @Override
    public void setID(UUID id) {
        this.id = id;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setRemainingTasks(int remainingTasks) {
        this.remainingTasks = remainingTasks;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    public Object connect() {
        try {
            Thread.sleep(500L);
            return "taskName: %s\nconnectorType: %s".formatted(taskName, connectorType);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
