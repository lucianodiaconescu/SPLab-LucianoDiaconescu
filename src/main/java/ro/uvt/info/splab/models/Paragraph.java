package ro.uvt.info.splab.models;

import ro.uvt.info.splab.services.AlignStrategy;

public class Paragraph implements Element, AlignStrategy {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }
    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print() {
        System.out.print("Paragraph: ");
        System.out.println(text);
    }

    @Override
    public String render(String text, int lineLength) {
        return null;
    }
}