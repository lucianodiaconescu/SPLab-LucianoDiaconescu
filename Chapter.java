public class Chapter {
    private String name;
    private void print(){

    }

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                '}';
    }
}
