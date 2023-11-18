// Employee.java
public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // Setter methods
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Formatted string for salary
    public String getFormattedSalary() {
        return "$" + employeeSalary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Alice", 50000.0);

        // Using getter methods
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Formatted Salary: " + employee.getFormattedSalary());

        // Using setter methods
        employee.setEmployeeName("Bob");
        employee.setEmployeeId(102);

        System.out.println("Updated Employee Name: " + employee.getEmployeeName());
        System.out.println("Updated Employee ID: " + employee.getEmployeeId());
    }
}
