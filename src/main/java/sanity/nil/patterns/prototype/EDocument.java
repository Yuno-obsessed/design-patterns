package sanity.nil.patterns.prototype;

import java.util.Objects;

public class EDocument extends Document {

    private String etag;

    public EDocument() {}

    public EDocument(EDocument target) {
        super(target);
        if (target != null) {
            this.etag = target.getEtag();
        }
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    @Override
    public Document clone() {
        return new EDocument(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EDocument eDocument = (EDocument) o;
        return Objects.equals(etag, eDocument.etag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), etag);
    }
}
