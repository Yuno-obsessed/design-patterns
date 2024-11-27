package sanity.nil.patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public abstract class WorkerFactory {

    private Map<UUID, Worker> workers = new HashMap<>();

    protected abstract Worker createWorker(UUID id);

    public final Worker buildWorker(UUID id) {
        return getByUUID(id).orElseGet(() -> {
            Worker worker = createWorker(id);
            registerWorker(worker);
            return worker;
        });
    }

    public final void registerWorker(Worker worker) {
        workers.put(worker.getID(), worker);
    }

    public final Optional<Worker> getByUUID(UUID id) {
        return Optional.ofNullable(workers.get(id));
    }
}
