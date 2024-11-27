package sanity.nil.patterns.bridge;

public abstract class File {

    protected Storage storage;

    protected File(Storage storage) {
        this.storage = storage;
    }

    public abstract void save();
}
