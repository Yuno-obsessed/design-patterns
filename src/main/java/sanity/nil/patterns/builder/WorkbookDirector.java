package sanity.nil.patterns.builder;

import java.time.LocalDateTime;
import java.util.HashSet;

public class WorkbookDirector {

    private Workbook.Builder builder;
    private Sheet.Builder sheetBuilder;

    public WorkbookDirector(Workbook.Builder builder, Sheet.Builder sheetBuilder) {
        this.builder = builder;
        this.sheetBuilder = sheetBuilder;
    }

    public void setBuilder(Workbook.Builder builder) {
        this.builder = builder;
    }

    public void setSheetBuilder(Sheet.Builder sheetBuilder) {
        this.sheetBuilder = sheetBuilder;
    }

    public Workbook buildStandardWorkbook() {
        builder.setTitle("Workbook1");
        builder.setAuthor("You");
        builder.setSheets(new HashSet<>());
        builder.setVersionYear(""+LocalDateTime.now().getYear());
        builder.setCreatedAt(LocalDateTime.now());
        builder.setModifiedAt(LocalDateTime.now());
        builder.addSheet(sheetBuilder.setTitle("Sheet1").setColor("Red").setText(" ").setCols(100).setRows(25).build());
        return builder.build();
    }
}
