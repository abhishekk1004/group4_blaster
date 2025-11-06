import java.util.Scanner;

public class Atm {
  public static void main(String[] args) {
    int pin = 1234;
    boolean accessGranted = false;
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      if (scan.nextInt() == pin) {
      accessGranted = true;
      break;
      }
      else System.out.println("Incorrect pin, try again");
    }
    if (accessGranted) System.out.println("AccessGranted");
    else System.out.println("Locked");
    scan.close();
  }
}
