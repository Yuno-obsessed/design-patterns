package sanity.nil.patterns.factory;

import java.util.UUID;

public class KafkaDLQWorker implements Worker {

    private UUID id;
    private String topic;
    private String strategy;

    @Override
    public void doWork() {
        System.out.printf("Processing DLQ messages in topic %s using strategy %s\n", topic, strategy);
    }

    @Override
    public UUID getID() {
        return id;
    }

    @Override
    public void setID(UUID id) {
        this.id = id;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
