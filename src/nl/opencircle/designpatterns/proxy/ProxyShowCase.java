package nl.opencircle.designpatterns.proxy;

public class ProxyShowCase {

    public static void main(String... args) {
        CalculationService service = new SlowCalculationService();
        CalculationService calculationService = new CachedCalculationService(service);

        for (int i = 0; i < 100; i++) {
            int square = calculationService.square(4);
            System.out.printf("4 squared is %d%n", square);
        }


    }
}
