package nl.opencircle.designpatterns.decorator;

public class DecoratorShowcase {

    public static void main(String... args) {
        HtmlService service = new HtmlService();

        service.write("This is some plain text");
        System.out.println("");

        service.writeItalic("This is some italic text");
        System.out.println("");

        service.writeBold("This is some bold text");
        System.out.println("");
    }
}
