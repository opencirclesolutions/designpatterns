package nl.opencircle.designpatterns.adapter;

public class USDistanceService {

    public long getDistanceInMiles(String cityA, String cityB) {
        return  cityA.length() * cityB.length();
    }
}
