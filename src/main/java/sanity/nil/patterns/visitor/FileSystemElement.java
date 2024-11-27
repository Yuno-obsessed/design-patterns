package sanity.nil.patterns.visitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
