import java.util.Scanner;

class Patient {
    int patientId, age;
    String name, problem, doctorAssigned;
    double feePaid;
    // 'this' means the variable of this object
    Patient(int patientId, String name, int age, String problem,
            String doctorAssigned, double feePaid) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.problem = problem;
        this.doctorAssigned = doctorAssigned;
        this.feePaid = feePaid;
    }
    void displayReport() {
        System.out.println(patientId + ", " + name + ", " + age + ", " + problem
                + ", Dr." + doctorAssigned + ", Fee: " + feePaid);
    }
    void updateDoctor(String doctor) {
        doctorAssigned = doctor;
        System.out.println("Doctor Updated!");
    }
    void addFee(double amount) {
        feePaid = feePaid + amount;
        System.out.println("Fee Added: " + amount);
    }
}
public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] p = new Patient[5];
        int count = 0;
        int choice;
        do {
            System.out.println("1.Register 2.Update Doctor 3.Add Fee 4.Display 5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter Id Name Age Problem Doctor Fee: ");
                p[count] = new Patient(sc.nextInt(), sc.next(), sc.nextInt(),
                        sc.next(), sc.next(), sc.nextDouble());
                count++;
                System.out.println("Patient Registered!");
            } else if (choice == 2) {
                System.out.print("Enter New Doctor: ");
                p[0].updateDoctor(sc.next());
            } else if (choice == 3) {
                System.out.print("Enter Fee Amount: ");
                p[0].addFee(sc.nextDouble());
            } else if (choice == 4) {
                for (int i = 0; i < count; i++)
                    p[i].displayReport();
            }
Page 4
Page 5
        } while (choice != 5);
        System.out.println("Thank You!");
    }
}
