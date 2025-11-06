import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Even numbers greater than 20:");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > 20) {
                System.out.print(numbers[i] + " ");
            }
        }
        
        sc.close();
    }
}