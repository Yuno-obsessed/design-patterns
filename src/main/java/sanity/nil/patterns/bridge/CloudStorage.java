package sanity.nil.patterns.bridge;

public class CloudStorage implements Storage {

    private String connectionURL;
    private String credentials;

    public CloudStorage(String connectionURL, String credentials) {
        this.connectionURL = connectionURL;
        this.credentials = credentials;
    }

    @Override
    public void save(String content) {
        if (connectionURL != null && credentials != null) {
            System.out.printf("Connection to a cloud at %s was established\n", connectionURL);
            System.out.println("Saving to cloud " + content);
        }
    }
}
