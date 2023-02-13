package nl.opencircle.designpatterns.decorator;

public class PlainWriter implements Writer {

    @Override
    public void writeSomeText(String text) {
        System.out.print(text);
    }
}
