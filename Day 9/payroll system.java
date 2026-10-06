// Base Class 
class Employee { 
    int id; 
    String name; 
    double baseSalary; 
 
    Employee(int id, String name, double salary) { 
        this.id = id; 
        this.name = name; 
        this.baseSalary = salary; 
    } 
 
    double calculateSalary(int days) { 
        return 0; // overridden 
    } 
 
    void displayPaySlip(int days, double salary) { 
        System.out.println("ID: " + id); 
        System.out.println("Name: " + name); 
        System.out.println("Days Present: " + days); 
        System.out.println("Net Salary: " + salary); 
        System.out.println("---------------------"); 
    } 
} 
 
// Manager Class 
class Manager extends Employee { 
    double bonus;
    Manager(int id, String name, double salary, double bonus) { 
super(id, name, salary);
        this.bonus = bonus; 
    } 
 
    double calculateSalary(int days) { 
        return (baseSalary / 30) * days + bonus; 
    } 
} 
 
// Developer Class 
class Developer extends Employee { 
    double projectAllowance; 
 
    Developer(int id, String name, double salary, double pa) { 
        super(id, name, salary); 
        projectAllowance = pa; 
    } 
 
    double calculateSalary(int days) { 
        return (baseSalary / 30) * days + projectAllowance; 
    } 
} 
 
// Intern Class 
class Intern extends Employee { 
    double stipend; 
 
    Intern(int id, String name, double stipend) { 
        super(id, name, stipend); 
        this.stipend = stipend; 
    } 
 
    double calculateSalary(int days) { 
        return (stipend / 30) * days; 
    } 
} 
// Main Class 
public class Overriding{ 
    public static void main(String[] args) { 
 
        Manager m = new Manager(1, "yeshe", 60000, 5000); 
        Developer d = new Developer(2, "khushi", 50000, 3000); 
        Intern i = new Intern(3, "Ram", 15000); 
 
        int days = 25; 
 
        double s1 = m.calculateSalary(days); 
        m.displayPaySlip(days, s1); 
double s2 = d.calculateSalary(days);
        d.displayPaySlip(days, s2); 
 
        double s3 = i.calculateSalary(days); 
        i.displayPaySlip(days, s3); 
    } 
}
