package nl.opencircle.designpatterns.decorator;

public abstract class BaseDecorator implements Writer {

    protected Writer wrappee;

    protected BaseDecorator(Writer wrappee) {
        this.wrappee = wrappee;
    }

}
