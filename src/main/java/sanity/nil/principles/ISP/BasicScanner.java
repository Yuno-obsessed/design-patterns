package sanity.nil.principles.ISP;

public class BasicScanner implements Scanner {
    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
}
