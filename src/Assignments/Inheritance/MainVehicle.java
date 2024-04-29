package Assignments.Inheritance;

public class Main{
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2020, 2);
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2023, 4100.3);

        // Calling methods
        car.start();
        car.displayInfo();
        car.stop();
        System.out.println();

        motorcycle.start();
        motorcycle.displayInfo();
        motorcycle.stop();
        System.out.println();

        electricCar.start();
        electricCar.displayInfo();
        electricCar.ChargingBattery();
        electricCar.stop();
    }
}
