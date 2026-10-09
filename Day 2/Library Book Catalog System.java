import java.util.Scanner;
class Book {
    
    String title, author, publisher, isbn;
    int year;
    double price;
    // 1. Default constructor
    Book() {
        title = "None";
        price = 0;
    }
    // 2. Parameterized constructor
    Book(String t, String a, String p, int y, String i, double pr) {
        title = t;
        author = a;
        publisher = p;
        year = y;
        isbn = i;
        price = pr;
    }
    // 3. Copy constructor (copies another Book)
    Book(Book b) {
        title = b.title;
        author = b.author;
        publisher = b.publisher;
        year = b.year;
        isbn = b.isbn;
        price = b.price;
    }
    void displayDetails() {
        System.out.println(title + ", " + author + ", " + publisher + ", "
                + year + ", " + isbn + ", Rs." + price);
    }
    // true if keyword is same as title or author
    boolean matches(String keyword) {

    }
        return title.equalsIgnoreCase(keyword) || author.equalsIgnoreCase(keyword);
    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
}
public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array of 3 Book objects
        Book[] b = new Book[3];
        b[0] = new Book("Java", "James", "Sun", 1995, "111", 500);
        b[1] = new Book("Python", "Guido", "PythonOrg", 2000, "222", 400);
        b[2] = new Book("C", "Dennis", "PHI", 1980, "333", 300);
        Book empty = new Book();          // default constructor
        Book copy = new Book(b[0]);       // copy constructor
        System.out.print("Copy of first book: ");
        copy.displayDetails();
        System.out.println("All Books:");
        for (int i = 0; i < 3; i++)
            b[i].displayDetails();
        System.out.print("Enter title/author to search: ");
        String key = sc.next();
        for (int i = 0; i < 3; i++)
            if (b[i].matches(key))
                b[i].displayDetails();
        System.out.print("Enter discount %: ");
        double d = sc.nextDouble();
        System.out.println("After Discount:");
        for (int i = 0; i < 3; i++) {
            b[i].applyDiscount(d);
            b[i].displayDetails();
        }
    }
}
