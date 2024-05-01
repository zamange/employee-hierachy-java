public class EmployeeTest {
    public static void main(String[] args) {
        // instances of Manager and Worker
        Manager manager = new Manager(101, "John Doe", 50000.0, "HR");
        Worker worker = new Worker(201, "Jane Smith", 30000.0, "Morning");

        // Display information for Manager
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + manager.getEmployeeId());
        System.out.println("Name: " + manager.getName());
        System.out.println("Salary: R" + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());

        // Display information for Worker
        System.out.println("\nWorker Details:");
        System.out.println("Employee ID: " + worker.getEmployeeId());
        System.out.println("Name: " + worker.getName());
        System.out.println("Salary: R" + worker.getSalary());
        System.out.println("Shift: " + worker.getShift());
    }
}