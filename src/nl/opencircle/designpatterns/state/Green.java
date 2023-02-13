package nl.opencircle.designpatterns.state;

public class Green extends TrafficLightState {

    @Override
    public boolean mayPass() {
        return true;
    }

    @Override
    public void goToNext(TrafficLight light) {
        light.goNext(new Orange());
    }

    @Override
    public String getName() {
        return "Green";
    }
}
