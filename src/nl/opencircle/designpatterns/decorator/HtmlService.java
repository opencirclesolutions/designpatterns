package nl.opencircle.designpatterns.decorator;

public class HtmlService {

    private final Writer plainWriter = new PlainWriter();

    private final Writer italicWriter = new ItalicWriter(plainWriter);

    private final Writer boldWriter = new BoldWriter(plainWriter);

    public void write(String text) {
        plainWriter.writeSomeText(text);
    }

    public void writeItalic(String text) {
        italicWriter.writeSomeText(text);
    }

    public void writeBold(String text) {
        boldWriter.writeSomeText(text);
    }
}
