package nl.opencircle.designpatterns.state;

public class TrafficLight {

    private TrafficLightState state = new Green();

    public void goNext(TrafficLightState state) {
        this.state = state;
    }

    public boolean mayPass() {
        return this.state.mayPass();
    }

    public String getColor() {
        return this.state.getName();
    }

    public void goNext() {
        this.state.goToNext(this);
    }
}
