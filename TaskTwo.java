public class TaskTwo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
