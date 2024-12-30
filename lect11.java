public class lect11 {
  // Types of recursion
  // 1.Head recursion 2.Tail recursion
  // Tail recursion
  public static int factorial(int n, int ans) {
    if (n == 1)
      return ans;
    return factorial(n - 1, n * ans);

  }

  public static int pow(int num, int p, int ans) {
    if (p == 0)
      return ans;
    return pow(num, p - 1, num * ans);
  }

  public static void subsequence(String ques, String ans) {
    if (ques.length() == 0) {
      System.out.println(ans);
      return;
    }
    char ch = ques.charAt(0);
    subsequence(ques.substring(1), ans + ch);
    subsequence(ques.substring(1), ans);

  }

  public static void cointoss(int n, String ans) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }

    cointoss(n - 1, ans + "H");
    cointoss(n - 1, ans + "T");
  }

  public static void genPar(int n, int left, int right, String ans) {
    if (left == n && right == n) {
      System.out.println(ans);
      return;
    }
    if (left > n || right > left)
      return;
    genPar(n, left + 1, right, ans + "{");
    genPar(n, left, right + 1, ans + "}");
  }

  public static void printPerms(String ques, String ans) {
    if (ques.length() == 0) {
      System.out.println(ans);
      return;
    }
    for (int i = 0; i < ques.length(); i++) {
      char ch = ques.charAt(i);
      String s1 = ques.substring(0, i);
      String s2 = ques.substring(i + 1);
      printPerms(s1 + s2, ans + ch);
    }
  }

  public static void main(String[] args) {
    // int n = 3;
    // int p = 3;
    // // System.out.println(factorial(n, 1));
    // System.out.println(pow(n, p, 1));
    // cointoss(n, "");
    String name = "abc";
    // subsequence(name, "");
    printPerms(name, "");
    // genPar(n, 0, 0, "");
  }
}
