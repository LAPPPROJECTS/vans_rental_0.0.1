package car;

import java.util.Collection;
import java.util.HashSet;

public class CarRepository {
    private final Collection<Car> cars = new HashSet<>();
                                            //HashSet implementuje interfejs Set (z kolekcji) , posiada więc metody:
                                           // add(), clear(), clone(), contains(), isEmpty(), iterator(), remove(), size().
                                           // Ich działania można się domyślić na podstawie nazwy.

    public void add(Car car) {
        cars.add(car);
    }
}
