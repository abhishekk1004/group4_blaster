ublic class SumProduct {
  public static void main(String[] args) {
    int sum = 0;
    int product = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) sum+=i;
      else product+=i;
    }
    System.out.println(sum);
    System.out.println(product);
  }
}
