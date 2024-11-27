package sanity.nil.patterns.proxy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RealFile implements File {
    private final String filePath;
    private String content;

    public RealFile(String filePath) {
        this.filePath = filePath;
        System.out.println("RealFile created for: " + filePath);
    }

    @Override
    public String getName() {
        return Paths.get(filePath).getFileName().toString();
    }

    @Override
    public String getContent() {
        if (content == null) {
            System.out.println("Loading file content from disk...");
            try {
                Path path = Paths.get(filePath);
                content = Files.readString(path);
            } catch (Exception e) {
                throw new RuntimeException("Failed to load file content: " + e.getMessage());
            }
        }
        return content;
    }

    @Override
    public int getSize() {
        try {
            Path path = Paths.get(filePath);
            return (int) Files.size(path);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get file size: " + e.getMessage());
        }
    }
}
