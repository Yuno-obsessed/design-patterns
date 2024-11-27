package sanity.nil.patterns.builder;

import java.time.LocalDateTime;
import java.util.Set;

public class Workbook {

    private String title;
    private String author;
    private Set<Sheet> sheets;
    private String versionYear;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public interface Builder {
        void reset();
        void setTitle(String title);
        void setAuthor(String author);
        void setSheets(Set<Sheet> sheets);
        void addSheet(Sheet sheet);
        void setVersionYear(String versionYear);
        void setCreatedAt(LocalDateTime createdAt);
        void setModifiedAt(LocalDateTime modifiedAt);
        Workbook build();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<Sheet> getSheets() {
        return sheets;
    }

    public void setSheets(Set<Sheet> sheets) {
        this.sheets = sheets;
    }

    public void addSheet(Sheet sheet) {
        this.sheets.add(sheet);
    }

    public String getVersionYear() {
        return versionYear;
    }

    public void setVersionYear(String versionYear) {
        this.versionYear = versionYear;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "Workbook [title=" + title + ", author=" + author + ", sheets=[" + sheets + "], versionYear=" + versionYear +
                ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
    }
}
