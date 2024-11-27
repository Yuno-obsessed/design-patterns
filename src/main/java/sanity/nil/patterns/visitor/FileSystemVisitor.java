package sanity.nil.patterns.visitor;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
