package sanity.nil.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {

    private Map<String, Document> documents = new HashMap<>();

    public DocumentRegistry() {
        Document monthlyReport = new EDocument();
        monthlyReport.setName("Monthly Report");
        monthlyReport.setType("Important");
        monthlyReport.setText("Some monthly report stuff");
        monthlyReport.setPages(10);
        ((EDocument) monthlyReport).setEtag("123142");
        documents.put("monthlyReport", monthlyReport);
        Document yearlyReport = new EDocument();
        yearlyReport.setName("Yearly Report");
        yearlyReport.setType("Very important");
        yearlyReport.setText("Some yearly report stuff");
        yearlyReport.setPages(60);
        ((EDocument) yearlyReport).setEtag("1231426");
        documents.put("yearlyReport", yearlyReport);
    }

    public Document getDocument(String name) {
        return documents.get(name).clone();
    }

    public void putDocument(String name, Document document) {
        documents.put(name, document);
    }
}
