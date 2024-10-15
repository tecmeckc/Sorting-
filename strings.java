import java.util.Scanner;

public class strings {
  // Check a pallindrome by using either a new String() or two pointers

  // q2 Find the length of the longest good string(it consists of vowels) by ASCII
  public static int longestGoodVowel(String s) {
    int len = 0;
    int curr = 0;
    s.toLowerCase();
    for (int j = 0; j < s.length(); j++) {
      char c = s.charAt(j);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        len++;
      } else {
        len = (int) Math.max(len, curr);
        curr = 0;
      }
    }
    return len;

  }

  public static void maxOcc(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i + 1))
        count++;
    }
    System.out.println(count);
  }

  // function to reverse a string
  public static void revString(String s) {
    for (int i = s.length() - 1; i >= 0; i--) {
      System.out.print(s.charAt(i));
    }
  }

  // using two pointers
  public static void revByPtrs(String s) {
    int low = 0, high = s.length() - 1;
    char c = s.charAt(low);
    char d = s.charAt(high);
    while (low < high) {
      char temp = s.charAt(low);
      c = s.charAt(high);
      d = temp;
      low++;
      high--;

    }
    System.out.println(s);
  }

  // check palindrome using new string
  public static boolean checkPalindrome(String s) {
    String s2 = new String();
    System.out.print(s + "=> ");
    for (int i = s.length() - 1; i >= 0; i--) {
      s2 += s.charAt(i);
    }

    if (s.equals(s2)) {
      return true;
    }
    return false;
  }

  // check palindrome using two pointers
  public static boolean twoP(String s) {
    s.replaceAll(" ", "");
    s.toLowerCase();
    int i = 0, j = s.length() - 1;
    while (i < j) {
      if (s.charAt(j) != s.charAt(i)) {
        return false;
      }

      i++;
      j--;
    }
    return true;

  }

  public static int Compare(String s1, String s2) {
    if (s1.equals(s2))
      return 0;
    else if (!(s1.equals(s2))) {
      if (s1.length() > s2.length()) {
        return 1;
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String p1 = "Khyati";
    String p2 = "Khyati";
    p2 += "Choudhary";
    String s2 = "Phone";
    String s1 = "aabcddeeeaaiaa";

    // maxOcc(s2);
    // System.out.println(s1.trim());

    // revString(s1);

  }
}
