package sanity.nil.patterns.prototype;

import java.util.Objects;

public abstract class Document {

    private String name;
    private String type;
    private String text;
    private int pages;

    public Document() {}

    public Document(Document target) {
        if (target != null) {
            this.name = target.name;
            this.type = target.type;
            this.text = target.text;
            this.pages = target.pages;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return pages == document.pages && Objects.equals(name, document.name) && Objects.equals(type, document.type) && Objects.equals(text, document.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, text, pages);
    }

    public abstract Document clone();
}
