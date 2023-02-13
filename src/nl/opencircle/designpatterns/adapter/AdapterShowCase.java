package nl.opencircle.designpatterns.adapter;

public class AdapterShowCase {

    public static void main(String... args) {
        USDistanceService usDistanceService = new USDistanceService();
        System.out.println("Distance from Denver to Boston is " + usDistanceService.getDistanceInMiles("Denver", "Boston") + " miles");

        DistanceService service = new DistanceServiceAdapter();
        System.out.println("Distance from Denver to Boston is " + service.getDistance("Denver", "Boston") + " kilometers");

    }
}
