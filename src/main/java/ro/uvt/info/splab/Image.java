package ro.uvt.info.splab;

public class Image implements Element{
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(url);
    }

}