public class Worker extends Employee{
    private String shift;
    public Worker(int employeeId, String name, double salary, String shift) {
        super(employeeId, name, salary);
        this.shift = shift;
    }
    public String getShift() {
        return shift;
    }
}
