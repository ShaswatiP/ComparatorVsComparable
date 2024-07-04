import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class CarComparable implements Comparable<Car>{
//    @Override
//    public int compareTo(Car otherCar) {
//        return this.Car.compareTo(otherCar.carType);
//    }
//}
// can't declare as above.
public class CarComparable {

    // to sort a CollectionObject using Comparable, We have to make the object implement Comparable Interface
    static class AnotherCar implements Comparable<AnotherCar> {
        String carName;
        String carType;

        public AnotherCar(String carName, String carType) {
            this.carName = carName;
            this.carType = carType;
        }

        public String toString() {
            return this.carName + " " + this.carType;
        }

    // Comparable interface has compareTo() that only takes 1 argument, compares current object with another object in argument.
        @Override
        public int compareTo(AnotherCar other) {
            return this.carType.compareTo(other.carType);
        }
    }

    public static void main(String[] args){
        List<AnotherCar> morecars = new ArrayList<>();
        morecars.add(new AnotherCar("SUV", "Diesel"));
        morecars.add(new AnotherCar("Mercedres", "Petrol"));
        morecars.add(new AnotherCar("Ertiga", "CNG"));

        // Here we can't write as Collection.sort(moreCars, new Comparable<>())
        Collections.sort(morecars);

        morecars.stream().forEach(anotherCar -> System.out.println(anotherCar.toString()));
        /* also based on above definition of AnotherCar class that implements Comparable interface, We can only sort in ascending order of CarType
        *to sort based on descending order of CarType, we have to change the compareTo() as below.
        *
        @Override
        public int compareTo(AnotherCar other) {
            return other.carType.compareTo(this.carType);
        }
        *
        * above issue doesn't happen in comparator with Lambda Expression:
        *   Collections.sort(cars,(Car c1, Car c2) -> c2.carType.compareTo(c1.carType));
        * we can simply write as above.
        *
        */

    }
}