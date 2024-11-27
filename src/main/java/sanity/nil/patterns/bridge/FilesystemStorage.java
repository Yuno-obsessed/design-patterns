package sanity.nil.patterns.bridge;

public class FilesystemStorage implements Storage {

    @Override
    public void save(String content) {
        System.out.println("Saving to local storage: " + content);
    }
}
