public class TaskFour {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        for (int num : nums) {
            if (num > 20 && num % 2 == 0) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}
