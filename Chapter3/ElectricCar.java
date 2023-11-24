package Chapter3;

class Automobile {
    int x = 10;
    private final String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    int x = 20;
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {
    int x = 30;
    public static void main(String[] wheels) {
        Car car = new ElectricCar();
        //var v =  car;
        System.out.println(car.drive());
        System.out.println(((Automobile)car).x);
    }

    public final String drive() {
        return "Driving electric car";
    }
}