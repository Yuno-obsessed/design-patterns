package sanity.nil.principles.ISP;

public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        Scanner scanner = new BasicScanner();
        MultiFunctionDevice mfd = new MultiFunctionDevice();

        DeviceManager manager = new DeviceManager();

        System.out.println("Using Basic Printer:");
        manager.usePrinter(printer, "Printer Document");

        System.out.println("\nUsing Basic Scanner:");
        manager.useScanner(scanner, "Scanner Document");

        System.out.println("\nUsing Multi-Function Device:");
        manager.usePrinter(mfd, "MFD Printer Document");
        manager.useScanner(mfd, "MFD Scanner Document");
        manager.useFax(mfd, "MFD Fax Document");
    }
}
