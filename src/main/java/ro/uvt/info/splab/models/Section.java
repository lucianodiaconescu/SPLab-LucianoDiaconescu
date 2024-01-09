package ro.uvt.info.splab.models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;
    List<Element> elementList = new ArrayList<Element>();
    public Section(String title) {
        this.title = title;
    }
    @Override
    public void add(Element e) {
        elementList.add(e);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    @Override
    public void remove(Element e) {
        elementList.remove(e);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : elementList) {
            element.print();
        }
    }

}