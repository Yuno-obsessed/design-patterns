package sanity.nil.principles.ISP;

public interface Device {
    void print(String document);
    void scan(String document);
    void fax(String document);
}
