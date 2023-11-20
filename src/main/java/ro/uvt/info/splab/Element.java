package ro.uvt.info.splab;

public interface Element {

    void add(Element e);
    default Element getElement() {
        return this;
    };
    void remove(Element e);
    void print();
}