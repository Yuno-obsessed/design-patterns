package sanity.nil.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        DocumentRegistry documentRegistry = new DocumentRegistry();
        Document monthlyReport = documentRegistry.getDocument("monthlyReport");
        Document monthlyReport2 = documentRegistry.getDocument("monthlyReport");

        if (monthlyReport == monthlyReport2) {
            System.out.println("The reports are the same");
        } else {
            System.out.println("Prototyped cloned reports are stored in different allocated memory");
            if (monthlyReport.equals(monthlyReport2)) {
                System.out.println("But still are the same objects according to .equals()");
            }
        }
    }
}
