package nl.opencircle.designpatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedCalculationService implements CalculationService {

    private final Map<Integer, Integer> cache = new HashMap<>();

    private final CalculationService proxied;

    public CachedCalculationService(CalculationService proxied) {
        this.proxied = proxied;
    }

    @Override
    public int square(int input) {
        if (!cache.containsKey(input)) {
            cache.put(input, proxied.square(input));
        }
        return cache.get(input);
    }
}
