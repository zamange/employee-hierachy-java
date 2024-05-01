public class Manager extends Employee{
    private final String department;

    public Manager(int employeeId, String name, double salary, String department) {
        super(employeeId, name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
