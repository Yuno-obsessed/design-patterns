package sanity.nil.patterns.factory;

import java.util.Scanner;
import java.util.UUID;

public class DummyWorkerFactory extends WorkerFactory {

    @Override
    public Worker createWorker(UUID id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the task: ");
        String taskName = sc.nextLine();
        System.out.println("Please enter the connectorType of the task: ");
        String connectorType = sc.nextLine();
        System.out.println("Please enter how many tasks to run: ");
        int tasks = sc.nextInt();
        DummyWorker worker = new DummyWorker();
        worker.setID(id);
        worker.setTaskName(taskName);
        worker.setConnectorType(connectorType);
        worker.setRemainingTasks(tasks);
        return worker;
    }
}
