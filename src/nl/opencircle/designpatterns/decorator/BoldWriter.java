package nl.opencircle.designpatterns.decorator;

public class BoldWriter extends BaseDecorator implements Writer {

    public BoldWriter(Writer wrappee) {
        super(wrappee);
    }

    @Override
    public void writeSomeText(String text) {
        System.out.print("<b>");
        wrappee.writeSomeText(text);
        System.out.print("</b>");
    }
}
