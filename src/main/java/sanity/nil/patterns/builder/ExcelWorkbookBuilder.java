package sanity.nil.patterns.builder;

import java.time.LocalDateTime;
import java.util.Set;

public class ExcelWorkbookBuilder implements Workbook.Builder {

    private Workbook workbook;

    public ExcelWorkbookBuilder() {
        this.workbook = new Workbook();
    }

    @Override
    public void reset() {
        workbook = new Workbook();
    }

    @Override
    public void setTitle(String title) {
        workbook.setTitle(title);
    }

    @Override
    public void setAuthor(String author) {
        workbook.setAuthor(author);
    }

    @Override
    public void setSheets(Set<Sheet> sheets) {
        workbook.setSheets(sheets);
    }

    @Override
    public void addSheet(Sheet sheet) {
        workbook.addSheet(sheet);
    }

    @Override
    public void setVersionYear(String versionYear) {
        workbook.setVersionYear(versionYear);
    }

    @Override
    public void setCreatedAt(LocalDateTime createdAt) {
        workbook.setCreatedAt(createdAt);
    }

    @Override
    public void setModifiedAt(LocalDateTime modifiedAt) {
        workbook.setModifiedAt(modifiedAt);
    }

    @Override
    public Workbook build() {
        return this.workbook;
    }
}
