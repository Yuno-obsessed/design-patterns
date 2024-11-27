package sanity.nil.principles.ISP;

public class DeviceManager {
    public void usePrinter(Printer printer, String document) {
        printer.print(document);
    }

    public void useScanner(Scanner scanner, String document) {
        scanner.scan(document);
    }

    public void useFax(Fax fax, String document) {
        fax.fax(document);
    }
}
