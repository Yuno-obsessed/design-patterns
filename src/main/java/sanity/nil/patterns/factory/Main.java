package sanity.nil.patterns.factory;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        DummyWorkerFactory dummyWorkerFactory = new DummyWorkerFactory();
        UUID id = UUID.randomUUID();
        dummyWorkerFactory.buildWorker(id).doWork();
        dummyWorkerFactory.buildWorker(id).doWork();
        System.out.println("Finish dummy");

        KafkaDLQWorkerFactory kafkaDLQWorkerFactory = new KafkaDLQWorkerFactory();
        UUID id2 = UUID.randomUUID();
        kafkaDLQWorkerFactory.buildWorker(id2).doWork();
        kafkaDLQWorkerFactory.buildWorker(id2).doWork();
        System.out.println("Finish kafkaDLQ");
    }
}
