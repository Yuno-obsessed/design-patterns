package sanity.nil.patterns.builder;

public class Sheet {

    private String title;
    private String text;
    private String color;
    private int rows;
    private int cols;

    public interface Builder {
        void reset();
        Builder setTitle(String title);
        Builder setText(String text);
        Builder setColor(String color);
        Builder setRows(int rows);
        Builder setCols(int cols);
        Sheet build();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
}
