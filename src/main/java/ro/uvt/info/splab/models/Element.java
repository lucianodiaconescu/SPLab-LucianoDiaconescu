package ro.uvt.info.splab.models;

public interface Element {

    void add(Element e);
    default Element getElement() {
        return this;
    };
    void remove(Element e);
    void print();
}