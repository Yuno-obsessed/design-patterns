package sanity.nil.principles.ISP;

public class MultiFunctionDevice implements Printer, Scanner, Fax {
    @Override
    public void print(String document) {
        System.out.println("MFD printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("MFD scanning document: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("MFD faxing document: " + document);
    }
}