import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.carType.compareTo(o2.carType);
    }


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("SUV", "Diesel"));
        cars.add(new Car("Mercedres", "Petrol"));
        cars.add(new Car("Ertiga", "CNG"));

        cars.sort(new CarComparator());
        cars.stream().forEach(car -> System.out.println(car.toString()));

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.carName.compareTo(o2.carName);
            }
        });
        cars.stream().forEach(car -> System.out.println(car.toString()));
    }
}
