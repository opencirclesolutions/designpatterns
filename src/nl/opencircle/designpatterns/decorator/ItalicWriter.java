package nl.opencircle.designpatterns.decorator;

public class ItalicWriter extends BaseDecorator implements Writer {

    public ItalicWriter(Writer wrappee) {
        super(wrappee);
    }

    @Override
    public void writeSomeText(String text) {
        System.out.print("<i>");
        wrappee.writeSomeText(text);
        System.out.print("</i>");
    }
}
