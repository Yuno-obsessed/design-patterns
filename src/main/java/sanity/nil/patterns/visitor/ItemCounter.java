package sanity.nil.patterns.visitor;

public class ItemCounter implements FileSystemVisitor {
    private int fileCount = 0;
    private int directoryCount = 0;

    @Override
    public void visit(File file) {
        fileCount++;
    }

    @Override
    public void visit(Directory directory) {
        directoryCount++;
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }

    public int getFileCount() {
        return fileCount;
    }

    public int getDirectoryCount() {
        return directoryCount;
    }
}
