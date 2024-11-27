package sanity.nil.patterns.visitor;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        Directory subDir = new Directory("subDir");
        File file3 = new File("file3.txt", 300);

        root.addElement(file1);
        root.addElement(file2);
        subDir.addElement(file3);
        root.addElement(subDir);

        SizeCalculator sizeCalculator = new SizeCalculator();
        root.accept(sizeCalculator);
        System.out.println("Total size: " + sizeCalculator.getTotalSize() + " KB");

        ItemCounter itemCounter = new ItemCounter();
        root.accept(itemCounter);
        System.out.println("Total files: " + itemCounter.getFileCount());
        System.out.println("Total directories: " + itemCounter.getDirectoryCount());
    }
}
