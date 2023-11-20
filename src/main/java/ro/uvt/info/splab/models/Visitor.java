package ro.uvt.info.splab.models;

public interface Visitor {
    void visitBook(Book book);
    void  visitSection(Section section);
    void visitTableOfContents(TableOfContents tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitImage(Image image);
    void visitTable(Table table);
}
