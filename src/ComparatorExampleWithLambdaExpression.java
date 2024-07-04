import java.util.*;

public class ComparatorExampleWithLambdaExpression {
        public static void main(String[] args){
            List<Car> cars = new ArrayList<>();
            cars.add(new Car("SUV", "Diesel"));
            cars.add(new Car("Mercedres", "Petrol"));
            cars.add(new Car("Ertiga", "CNG"));

            cars.stream().forEach(car -> System.out.println(car.toString()));

            /* Collections.sort(Collection_Object_list, Comparator<Collection_Object>)
            *
            * Collections.sort() or Arrays.sort() both take Comparator as an argument, we can pass Comparator functional Interface as a Lambda Expression.
            *
            */
            Collections.sort(cars,(Car c1, Car c2) -> c2.carType.compareTo(c1.carType));

            System.out.println("\nprint in descending order of carType:");
            cars.stream().forEach(car -> System.out.println(car.toString()));

            System.out.println("\nprint in ascending order of carType:");
            Collections.sort(cars,(Car c1, Car c2) -> c1.carType.compareTo(c2.carType));

            cars.stream().forEach(car -> System.out.println(car.toString()));

            Car[] arcar = new Car[3];
            arcar[0] = new Car("SUV", "Diesel");
            arcar[2] = new Car("Mercedres", "Petrol");
            arcar[1] = new Car("Ertiga", "CNG");


            Arrays.sort(arcar,(Car c1, Car c2) -> c1.carName.compareTo(c2.carName));
            System.out.println("\nprint in ascending order of carName:");
            Arrays.stream(arcar).forEach(ac -> System.out.println(ac.toString()));

        }
}
