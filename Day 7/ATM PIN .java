import java.util.Scanner; 
class ATMPinChecker { 
// Attributes 
String username; 
String pinStored; 
// Constructor 
ATMPinChecker(String username, String pinStored) { 
this.username = username; 
this.pinStored = pinStored; 
} 
// Verify PIN using string comparison 
boolean verifyPIN(String enteredPIN) { 
return pinStored.equals(enteredPIN); 
} 
// Authenticate method (3 attempts) 
void authenticate() { 
Scanner sc = new Scanner(System.in); 
int attempts = 0; 
while (attempts < 3) { 
System.out.print("Enter PIN: "); 
String enteredPIN = sc.nextLine(); 
if (verifyPIN(enteredPIN)) { 
System.out.println("PIN ENTERED CORRECT"); 
return; 
} else { 
System.out.println("Wrong PIN"); 
attempts++; 
} 
} 
System.out.println("ACCOUNT LOCKED"); 
} 
} 
public class StringComparison{ 
public static void main(String[] args) { 
// Create object 
ATMPinChecker user = new ATMPinChecker("User1", "1234"); 
// Start authentication 
user.authenticate(); 
}
}
