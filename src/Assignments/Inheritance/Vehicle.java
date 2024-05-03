package Assignments.Inheritance;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start(){
        System.out.println("Starting engine  ");
    }
    public void stop(){
        System.out.println("stopping the engine");
    }
    public void displayInfo(){
        System.out.println("Displaying all info of the vehicle: " + " make is : " + make + " Model is : "+ model + " year is : "+ year );
    }
}
class Car extends Vehicle{
    protected int numDoors;

    public Car(String make, String model, int year) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors " + numDoors);
    }
}
class Motorcycle extends Vehicle{
    protected int numCylinders;

    public Motorcycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Cylinders :" + numCylinders);
    }
}
class ElectricCar extends Car{
    protected double batteryCapacity;

    public ElectricCar(String make, String model, int year, double batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }
    public void ChargingBattery(){
        System.out.println("Battery is charging ");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery has a capacity of " + batteryCapacity + "kWh");
    }
}
