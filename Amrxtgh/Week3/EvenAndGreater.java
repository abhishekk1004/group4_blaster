import java.util.Scanner;

public class EvenAndGreater {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] input = new int[10];
    System.out.println("Enter 10 integers:");
    for (int i = 0; i < 10; i++) {
      input[i] = scan.nextInt();
    }
    System.out.println("Numbers that are even and greater than 20:");
    for (int i = 0; i < 10; i++) {
      if (input[i] % 2 == 0 && input[i] > 20) System.out.println(input[i]);
    }
    scan.close();
  }
}
