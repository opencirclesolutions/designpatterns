package nl.opencircle.designpatterns.state;

public class Orange extends  TrafficLightState {
    @Override
    public boolean mayPass() {
        return false;
    }

    @Override
    public void goToNext(TrafficLight light) {
        light.goNext(new Red());
    }

    @Override
    public String getName() {
        return "Orange";
    }
}
