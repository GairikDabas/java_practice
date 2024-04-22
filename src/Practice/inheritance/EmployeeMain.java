package Practice.inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Address address = new Address("889 errol Road", "Sarnia","ON","N7T 2G8");
        Employee employee = new Employee("gairik", "Software developer" , 20000, address);
        employee.PrintEmployeeDetails();
    }
}
