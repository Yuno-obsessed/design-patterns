package sanity.nil.patterns.proxy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProxy implements File {
    private final String filePath;
    private RealFile realFile;

    public FileProxy(String filePath) {
        this.filePath = filePath;
        System.out.println("FileProxy created for: " + filePath);
    }

    @Override
    public String getName() {
        return Paths.get(filePath).getFileName().toString();
    }

    @Override
    public String getContent() {
        if (realFile == null) {
            realFile = new RealFile(filePath);
        }
        return realFile.getContent();
    }

    @Override
    public int getSize() {
        if (realFile == null) {
            System.out.println("FileProxy getting size without loading content...");
            try {
                Path path = Paths.get(filePath);
                return (int) Files.size(path);
            } catch (Exception e) {
                throw new RuntimeException("Failed to get file size: " + e.getMessage());
            }
        }
        return realFile.getSize();
    }
}
