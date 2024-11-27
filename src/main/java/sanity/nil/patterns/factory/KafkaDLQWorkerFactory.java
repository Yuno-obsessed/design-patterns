package sanity.nil.patterns.factory;

import java.util.UUID;

public class KafkaDLQWorkerFactory extends WorkerFactory {
    @Override
    protected Worker createWorker(UUID id) {
        System.out.println("Creating kafkaDLQWorker with id " + id);
        KafkaDLQWorker worker = new KafkaDLQWorker();
        worker.setID(id);
        worker.setTopic("test-topic");
        worker.setStrategy("analyzing");
        return worker;
    }
}
