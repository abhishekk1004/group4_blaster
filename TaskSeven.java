public class TaskSeven {
    public static void main(String[] args) {
        final String PIN = "1234";
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int attempts = 3;
        boolean verified = false;

        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            String input = sc.nextLine().trim();
            if (PIN.equals(input)) {
                System.out.println("Access granted");
                verified = true;
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect PIN. Attempts left: " + attempts);
                }
            }
        }

        if (!verified) {
            System.out.println("Card locked. Please contact the bank.");
        }

        sc.close();
    }
}
