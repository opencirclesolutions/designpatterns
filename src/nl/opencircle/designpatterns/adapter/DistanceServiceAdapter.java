package nl.opencircle.designpatterns.adapter;

public class DistanceServiceAdapter implements DistanceService {

    private USDistanceService adaptee = new USDistanceService();

    @Override
    public long getDistance(String cityA, String cityB) {
        return (1609 * adaptee.getDistanceInMiles(cityA, cityB)) / 1000;
    }
}
