import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int correctPIN = 1234;
        int attempts = 0;
        int maxAttempts = 3;
        
        System.out.println("ATM PIN Verification System");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter PIN: ");
            int enteredPIN = sc.nextInt();
            
            if (enteredPIN == correctPIN) {
                System.out.println("Access Granted");
                sc.close();
                return;
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Incorrect PIN, try again");
                }
            }
        }
        
        System.out.println("Account locked");
        sc.close();
    }
}