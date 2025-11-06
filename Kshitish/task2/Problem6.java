public class Problem6 {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 30 with special rules:");
        
        for (int i = 1; i <= 30; i++) {
            if (i == 15) {
                System.out.println("skip");
            } else if (i % 4 == 0) {
                System.out.println(i * 2);
            } else {
                System.out.println(i);
            }
        }
        
        System.out.println("done");
    }
}