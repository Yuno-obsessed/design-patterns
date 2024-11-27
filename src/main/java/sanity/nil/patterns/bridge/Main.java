package sanity.nil.patterns.bridge;

public class Main {
    public static void main(String[] args) {
        File textFileLocal = new TextFile("Simple text content", new FilesystemStorage());
        textFileLocal.save();

        File textFileCloud = new TextFile("Sensitive text content",
                new CloudStorage("example.com", "admin:admin"));
        textFileCloud.save();

        File imageFileLocal = new ImageFile("Image data", new FilesystemStorage());
        imageFileLocal.save();

        File imageFileCloud = new ImageFile("Sensitive image data",
                new CloudStorage("example.com", "admin:admin"));
        imageFileCloud.save();

    }
}
