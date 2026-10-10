import java.util.Scanner;

class Student {
    String name;
    int rollNo, total;
    int[] marks;
    double average;
    // marks array is created with size n (dynamic)
    Student(int rollNo, String name, int n) {
        this.rollNo = rollNo;
        this.name = name;
        marks = new int[n];
    }
    void computeTotal() {
        total = 0;
        for (int i = 0; i < marks.length; i++)
            total = total + marks[i];
    }
    void computeAverage() {
        average = (double) total / marks.length;
    }
    char grade() {
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 60) return 'C';
        else if (average >= 50) return 'D';
        else return 'F';
    }
    void displayResult() {
        System.out.println(rollNo + "  " + name + "  Total=" + total
                + "  Avg=" + average + "  Grade=" + grade());
    }
}
public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter RollNo Name NoOfSubjects: ");
            s[i] = new Student(sc.nextInt(), sc.next(), sc.nextInt());
            System.out.print("Enter marks: ");
            for (int j = 0; j < s[i].marks.length; j++)
                s[i].marks[j] = sc.nextInt();
            s[i].computeTotal();
            s[i].computeAverage();
        }
        System.out.println("--- Results ---");
        for (int i = 0; i < 10; i++)
            s[i].displayResult();
    }
}
