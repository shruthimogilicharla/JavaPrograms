class Employee { 
// Outer class attributes 
int id; 
String name; 
double baseSalary; 
String department; 
// Default Constructor 
Employee() { 
id = 0; 
name = ""; 
baseSalary = 0; 
department = ""; 
} 
// Parameterized Constructor 
Employee(int id, String name, double baseSalary, String department) { 
this.id = id; 
this.name = name; 
this.baseSalary = baseSalary; 
this.department = department; 
} 
// Display Employee Details 
void displayEmployeeDetails() { 
System.out.println("ID: " + id); 
System.out.println("Name: " + name); 
System.out.println("Department: " + department); 
System.out.println("Base Salary: " + baseSalary); 
    } 
 
    // Calculate Salary (calls inner class) 
    void calculateSalary() { 
        SalaryBreakup sb = new SalaryBreakup(); 
        sb.computeBreakup(); 
        sb.printBreakup(); 
    } 
 
    // Generate Salary Slip 
    void generateSlip() { 
        System.out.println("\n--- Salary Slip ---"); 
        displayEmployeeDetails(); 
        calculateSalary(); 
        System.out.println("------------------------"); 
    } 
 
    // Inner Class 
    class SalaryBreakup { 
        double hra, da, pf, tax, netPay; 
 
        // Compute breakup using outer class baseSalary 
        void computeBreakup() { 
            hra = baseSalary * 0.20;   // 20% HRA 
            da  = baseSalary * 0.10;   // 10% DA 
            pf  = baseSalary * 0.05;   // 5% PF 
            tax = baseSalary * 0.10;   // 10% Tax 
 
            netPay = baseSalary + hra + da - pf - tax; 
        } 
 
        // Print breakup 
        void printBreakup() { 
            System.out.println("HRA: " + hra); 
            System.out.println("DA: " + da); 
            System.out.println("PF: " + pf); 
            System.out.println("Tax: " + tax); 
            System.out.println("Net Pay: " + netPay); 
        } 
    } 
} 
 
public class Constructor{ 
    public static void main(String[] args) { 
 
        // Create Employee objects 
Employee e1 = new Employee(1, "Ravi", 30000, "CSE"); 
Employee e2 = new Employee(2, "Sita", 40000, "ECE"); 
// Generate Salary Slips 
e1.generateSlip(); 
e2.generateSlip(); 
} 
}
