public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            boolean div3 = (i % 3 == 0);
            boolean div5 = (i % 5 == 0);
            if (div3 ^ div5) { // true if divisible by 3 or 5 but not both
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

