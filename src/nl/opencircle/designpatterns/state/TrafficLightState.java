package nl.opencircle.designpatterns.state;

public abstract class TrafficLightState {

    public abstract boolean mayPass();

    public abstract void goToNext(TrafficLight  light);

    public abstract String getName();
}
