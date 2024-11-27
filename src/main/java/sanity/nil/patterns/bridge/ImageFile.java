package sanity.nil.patterns.bridge;

public class ImageFile extends File {

    private String imageData;

    public ImageFile(String imageData, Storage storage) {
        super(storage);
        this.imageData = imageData;
    }

    @Override
    public void save() {
        System.out.println("Saving image file...");
        storage.save(imageData);
    }
}
