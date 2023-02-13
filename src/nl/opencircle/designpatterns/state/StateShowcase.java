package nl.opencircle.designpatterns.state;


public class StateShowcase {

    public static void main(String... args) throws InterruptedException {
        TrafficLight light = new TrafficLight();

        while (true) {
            System.out.println("Traffic light is now " + light.getColor() +
                    ", drivers may pass: " + light.mayPass());
            light.goNext();
            Thread.sleep(3000);
        }

    }
}
