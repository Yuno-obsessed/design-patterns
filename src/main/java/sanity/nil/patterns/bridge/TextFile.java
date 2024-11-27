package sanity.nil.patterns.bridge;

public class TextFile extends File {

    private String textContent;

    public TextFile(String textContent, Storage storage) {
        super(storage);
        this.textContent = textContent;
    }

    @Override
    public void save() {
        System.out.println("Saving text file...");
        storage.save(textContent);
    }
}
