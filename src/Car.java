public class Car {
    String carName;
    String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
    public String toString(){
        return this.carName+" "+this.carType;
    }
}
