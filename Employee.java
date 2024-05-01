public class Employee {
    //properties
    private int employeeId;
    private String name;
    private double salary;

    //constructor
    public Employee( int employeeId, String name, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    //getter method


    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
