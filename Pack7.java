// File: employee/Emp.java
package employee;

public class Emp {
    // Variables declaration
    private String name;
    private int empid;
    private String category;
    private double bpay, hra, da, npay, pf, grosspay, incometax, allowance;

    // Methods for calculations
    // (You can add your calculations here)

    public void calculateSalary() {
        // Sample calculation
        grosspay = bpay + hra + da;
        npay = grosspay - pf;
        incometax = grosspay * 0.1;
        allowance = grosspay * 0.05;
    }

    public void displayDetails() {
        System.out.println("Employee Details: " + name + ", " + empid + ", " + category);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Net Pay: " + npay);
        System.out.println("Income Tax: " + incometax);
        System.out.println("Allowance: " + allowance);
    }
}

// File: Emppay.java
import employee.Emp;

public class Emppay {
    public static void main(String[] args) {
        // Create an object of Emp class
        Emp e = new Emp();

        // Set values for variables (you can modify these as per your requirements)
        e.name = "John Doe";
        e.empid = 101;
        e.category = "Manager";
        e.bpay = 5000;
        e.hra = 1500;
        e.da = 2000;
        e.pf = 1000;

        // Calculate and display details
        e.calculateSalary();
        e.displayDetails();
    }
}
