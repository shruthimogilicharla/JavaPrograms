// Base Class 
class Vehicle { 
    String vehicleNo, brand; 
    double baseFare; 
 
    Vehicle(String vNo, String br, double fare) { 
        vehicleNo = vNo; 
        brand = br; 
        baseFare = fare; 
    } 
 
    double calculateFare(int days) { 
        return 0; // overridden 
    } 
 
    void displayBill(double amount) { 
        System.out.println("Vehicle No: " + vehicleNo); 
        System.out.println("Brand: " + brand); 
        System.out.println("Total Fare: " + amount); 
        System.out.println("---------------------"); 
    } 
} 
 
// Car Class 
class Car extends Vehicle { 
    int noOfSeats; 
    boolean acAvailable; 
 
    Car(String vNo, String br, double fare, int seats, boolean ac) { 
        super(vNo, br, fare); 
        noOfSeats = seats; 
        acAvailable = ac;
         } 
    double calculateFare(int days) { 
        return baseFare * days + (acAvailable ? 500 : 0); 
    } 
} 
 
// Bike Class 
class Bike extends Vehicle { 
    boolean helmetRequired, geared; 
 
    Bike(String vNo, String br, double fare, boolean helmet, boolean geared) { 
        super(vNo, br, fare); 
        helmetRequired = helmet; 
        this.geared = geared; 
    } 
 
    double calculateFare(int days) { 
        return baseFare * days; 
    } 
} 
 
// SUV Class 
class SUV extends Vehicle { 
    boolean fourWheelDrive; 
    int luxuryLevel; 
 
    SUV(String vNo, String br, double fare, boolean fwd, int level) { 
        super(vNo, br, fare); 
        fourWheelDrive = fwd; 
        luxuryLevel = level; 
    } 
 
    double calculateFare(int days) { 
        return baseFare * days + luxuryLevel * 1000; 
    } 
} 
 
// Main Class 
public class HierarchicalInheritance { 
    public static void main(String[] args) { 
 
        Car c = new Car("C101", "Hyundai", 2000, 5, true); 
        Bike b = new Bike("B101", "Honda", 500, true, true); 
        SUV s = new SUV("S101", "Toyota", 3000, true, 2); 
 
        int days = 3; 
 
        double fare1 = c.calculateFare(days); 
 c.displayBill(fare1); 
        double fare2 = b.calculateFare(days); 
        b.displayBill(fare2); 
 
        double fare3 = s.calculateFare(days); 
        s.displayBill(fare3); 
    } 
}
