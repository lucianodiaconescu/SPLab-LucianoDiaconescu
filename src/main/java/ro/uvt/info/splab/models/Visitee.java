package ro.uvt.info.splab.models;

public interface Visitee {
    void acceptVisitor(Visitor visitor);
}