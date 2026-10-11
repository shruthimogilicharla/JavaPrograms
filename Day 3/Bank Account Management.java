class BankAccount {
    String accountHolder, accountType;
    int accountNumber;
    double balance;
    // Parameterized constructor
    BankAccount(String name, int no, double bal, String type) {
        accountHolder = name;
        accountNumber = no;
        balance = bal;
        accountType = type;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(accountHolder + " deposited " + amount);
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(accountHolder + ": Insufficient Funds!");
        } else {
            balance = balance - amount;
            System.out.println(accountHolder + " withdrew " + amount);
        }
    }
    void checkBalance() {
        System.out.println(accountHolder + " Balance: " + balance);
    }
    double calculateInterest(float rate) {
        return balance * rate / 100;
    }
}
public class Account {
    public static void main(String[] args) {
        // two accounts
        BankAccount a1 = new BankAccount("Ravi", 101, 1000, "Saving");
        BankAccount a2 = new BankAccount("Sita", 102, 2000, "Current");
        a2.deposit(100);
        a2.checkBalance();
        a1.withdraw(5000);      // fails, not enough money
        a1.withdraw(500);
        a1.checkBalance();
        System.out.println("Interest for Ravi: " + a1.calculateInterest(5));
    }
}
