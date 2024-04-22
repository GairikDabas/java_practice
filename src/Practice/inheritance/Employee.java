package Practice.inheritance;

import java.sql.SQLOutput;

public class Employee {
     String name;
     String position;
     int salary;
     Address address;

    public Employee(String name, String position, int salary, Address address) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.address = address;
    }
    public void PrintEmployeeDetails(){
        System.out.println("Name : " + name);
        System.out.println("Position : " + position);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + address );
    }
}
