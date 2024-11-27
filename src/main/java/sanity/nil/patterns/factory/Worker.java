package sanity.nil.patterns.factory;

import java.util.UUID;

public interface Worker {
    void doWork();
    UUID getID();
    void setID(UUID id);
}
