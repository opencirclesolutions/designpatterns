package nl.opencircle.designpatterns.state;

public class Red extends TrafficLightState {
    @Override
    public boolean mayPass() {
        return false;
    }

    @Override
    public void goToNext(TrafficLight light) {
        light.goNext(new Green());
    }

    @Override
    public String getName() {
        return "Red";
    }
}
