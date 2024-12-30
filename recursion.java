public class recursion {
  // Head recursion
  public static int fact(int n) {
    if (n <= 0) {
      return -1;
    }
    if (n == 1)
      return 1;
    int temp = n * fact(n - 1);
    return temp;
  }

  public static int fib(int n) {
    if (n == 0 || n == 1)
      return n;

    int fibo = fib(n - 1) + fib(n - 2);
    return fibo;
  }

  public static int pow(int x, int n) {
    // if(n<0) return -1;
    if (n == 0)
      return 1;
    int power = x * pow(x, n - 1);
    return power;
  }

  public static void main(String[] args) {
    int x = 4;
    int n = 3;
    // System.out.println(fact(n));
    System.out.println(pow(x, n));
  }
}
