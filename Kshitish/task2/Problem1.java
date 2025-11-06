public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 or 5 (but not both):");
        
        for (int i = 1; i <= 50; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}