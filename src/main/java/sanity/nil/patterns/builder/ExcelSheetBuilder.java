package sanity.nil.patterns.builder;

public class ExcelSheetBuilder implements Sheet.Builder {

    private Sheet sheet;

    public ExcelSheetBuilder() {
        this.sheet = new Sheet();
    }

    @Override
    public void reset() {
        this.sheet = new Sheet();
    }

    @Override
    public Sheet.Builder setTitle(String title) {
        sheet.setTitle(title);
        return this;
    }

    @Override
    public Sheet.Builder setText(String text) {
        sheet.setText(text);
        return this;
    }

    @Override
    public Sheet.Builder setColor(String color) {
        sheet.setColor(color);
        return this;
    }

    @Override
    public Sheet.Builder setRows(int rows) {
        sheet.setRows(rows);
        return this;
    }

    @Override
    public Sheet.Builder setCols(int cols) {
        sheet.setCols(cols);
        return this;
    }

    @Override
    public Sheet build() {
        return this.sheet;
    }
}
