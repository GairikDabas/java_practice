package Assignments.Inheritance;

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2020, 2);
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2023, 4100.3);

        // Calling methods
        car.start();
        car.stop();
        car.displayInfo();

        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.displayInfo();

        System.out.println();

        electricCar.start();
        electricCar.stop();
        electricCar.displayInfo();
        electricCar.ChargingBattery();

    }
}
