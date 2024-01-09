package ro.uvt.info.splab.models;

public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public Element getElement() {
        return Element.super.getElement();
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void print() {

    }
}