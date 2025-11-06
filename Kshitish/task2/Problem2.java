import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Numbers from 1 to " + n + " (skipping multiples of 4):");
        for (int i = 1; i <= n; i++) {
            if (i % 4 != 0) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}