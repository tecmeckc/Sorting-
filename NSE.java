package Sorting;

public class NSE {
  static void display(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // classwork
  static int[] NSER(int[] arr) {
    int[] temp1 = new int[arr.length];
    int minEl = Integer.MAX_VALUE;
    for (int i = arr.length - 1; i >= 0; i--) {
      temp1[i] = minEl;
      if (arr[i] < minEl) {
        minEl = arr[i];
      }
    }
    return temp1;
  }

  // homework
  static int[] NSEL(int[] arr) {
    int[] temp2 = new int[arr.length];
    int minEle = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      temp2[i] = minEle;
      if (arr[i] < minEle) {
        minEle = arr[i];
      }
    }
    return temp2;
  }

  public static void main(String[] args) {
    int[] A = { 1, 5, 7, 5, 8, 4, 6, 2 };
    int[] NSER = NSER(A);
    display(NSER);
    System.out.println();
    int[] NSEL = NSEL(A);
    display(NSEL);
  }
}
