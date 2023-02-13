package nl.opencircle.designpatterns.proxy;

public class SlowCalculationService implements CalculationService {

    @Override
    public int square(int input) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return input * input;
    }
}
