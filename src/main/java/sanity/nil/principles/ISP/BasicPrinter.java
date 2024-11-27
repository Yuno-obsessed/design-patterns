package sanity.nil.principles.ISP;

public class BasicPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}
